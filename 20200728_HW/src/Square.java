public class Square {
    public double square(int num) {
        return squareTemp(num, num);
    }

    public static double squareTemp(int num, int numPow) {
        if (numPow == 0) {
            return num += num;
        }
        return squareTemp(num, numPow - 1);
    }

    public int square2(int num) {
        int temp = num;
        for (int i = num - 1; i > 0; i--) {
            num += temp;
        }
        return num;
    }

    public static int sqr(int n) {
        if (n == 1) {
            return 1;
        }
        int res = sqr(n - 1) + n + n - 1;
        return res;
    }
}
