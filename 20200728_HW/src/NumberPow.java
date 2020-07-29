public class NumberPow {
    public double numberToPow(int num, int pow){
        return Math.pow(num, pow);
    }

    public static double numberToPow2(int num, int pow){
        double retPow = 0;
        if (pow==0){
            return num+=num;
        }
        return numberToPow2(num, pow-1);
    }
}
