public class Palindrom {
    //Определить, является ли число палиндромом. Например 10201 или 12388321
    public boolean isPalindrom(int num) {
        char[] ch = String.valueOf(num).toCharArray();
        for (int i = 0, j = ch.length-1; i < ch.length / 2; i++, j--) {
            if (ch[i] != ch[j]) {
                return false;
            }
        }
        return true;
    }
}
