package thread2;

import java.util.List;
import java.util.Random;

public class BankEmployee extends Thread {
    String name;
    int contsKredit;
    int minTime;
    int maxTime;
    final List<Kredit> kreditsList;
    Random random = new Random();

    public BankEmployee(String name, int contsKredit, int minTime, int maxTime, List<Kredit> kreditsList) {
        this.name = name;
        this.contsKredit = contsKredit;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.kreditsList = kreditsList;
    }

    @Override
    public void run() {
        int beforeTime = (int) System.currentTimeMillis();
        for (int i = 0; i < contsKredit; i++) {
            int timeKredit = minTime + random.nextInt(maxTime - minTime);
            try {
                Thread.sleep(timeKredit);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int timeDuration = (int) (System.currentTimeMillis() - beforeTime);
        synchronized (kreditsList) {
            kreditsList.add(new Kredit(name, timeDuration));
        }
    }
}
