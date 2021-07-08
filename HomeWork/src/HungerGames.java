import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HungerGames {
    public static final long SLEEP_TIME = 3000;

    public static void main(String[] args) throws InterruptedException, IOException {
        List<Score> score = new ArrayList<>();
        Tarakan t1 = new Tarakan("t1", 10, score);
        Tarakan t2 = new Tarakan("t2", 10, score);
        Tarakan t3 = new Tarakan("t3", 10, score);
        Tarakan t4 = new Tarakan("t4", 10, score);
        Tarakan t5 = new Tarakan("t5", 10, score);
        Tarakan t6 = new Tarakan("t6", 10, score);
        Tarakan t7 = new Tarakan("t7", 10, score);
        Tarakan t8 = new Tarakan("t8", 10, score);
        Tarakan t9 = new Tarakan("t9", 10, score);
        Tarakan t1000 = new Tarakan("t1000", 10, score);
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);
        Thread th4 = new Thread(t4);
        Thread th5 = new Thread(t5);
        Thread th6 = new Thread(t6);
        Thread th7 = new Thread(t7);
        Thread th8 = new Thread(t8);
        Thread th9 = new Thread(t9);
        Thread th1000 = new Thread(t1000);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();
        th8.start();
        th9.start();
        th1000.start();
        Thread.sleep(SLEEP_TIME);
        score.sort(Comparator.comparingInt(Score::getScore));
        getWinner(score);
        // бывает: Exception in thread "main" java.lang.NullPointerException((
        for (int i = 0; i < score.size(); i++) {
            System.out.println("Place: " + (i + 1) + ", "
                    + score.get(i));
        }
    }

    public static void getWinner(List<Score> score) throws IOException {
        System.out.println("Enter winners name: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input.equals(score.get(0).name)) {
            System.out.println("Your win!!");
        }
        System.out.println("Luck next time");

    }
}
