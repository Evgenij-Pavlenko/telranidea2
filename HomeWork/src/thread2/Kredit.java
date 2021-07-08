package thread2;

public class Kredit {
    String employeeName;
    int allKreditTime;

    public String getEmployeeName() {
        return employeeName;
    }

    public int getAllKreditTime() {
        return allKreditTime;
    }


    public Kredit(String employeeName, int allKreditTime) {
        this.employeeName = employeeName;
        this.allKreditTime = allKreditTime;
    }
}
