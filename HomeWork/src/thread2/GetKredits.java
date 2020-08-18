package thread2;

import java.util.ArrayList;
import java.util.List;

/*
Вася, Маша и Петя выдают кредиты.
Маша выдает кредит от 100 до 200 мс
Петя выдает кредит от 100 до 300 мс
Вася ленивый, творческая натура, обычно выдает кредит от 200 до 300 мс.
Но в каждый момент у него может прийти озарение на 3 последующих кредита и он выдает их от 100 до 150 мс.
Вероятность озарения 30%. Кредитов у каждого 20.
(Типа как с тараканами)
 */
public class GetKredits {
    public static void main(String[] args) throws InterruptedException {
        List<Kredit> allKredits = new ArrayList<>();
        BankEmployee masha = new BankEmployee("Masha", 20, 100, 200, allKredits);
        BankEmployee petja = new BankEmployee("Petja", 20, 100, 300, allKredits);
        BankEmployee vasja = new BankEmployee("Vasja", 20, 200, 300, allKredits);

        masha.start();
        petja.start();
        vasja.start();

        masha.join();
        petja.join();
        vasja.join();

        int place = 0;
        for (Kredit kredit : allKredits) {
            String format = String.format("%d, The employee %s spent time %d milliseconds"
                    , ++place, kredit.getEmployeeName(), kredit.getAllKreditTime());

            System.out.println(format);
        }
    }
}
