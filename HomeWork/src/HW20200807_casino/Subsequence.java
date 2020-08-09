package HW20200807_casino;

/*
Одна последовательность символов (чисел, букв, чего угодно) называется подпоследовательностью другой последовательности,
 если все элементы из первой встречаются во второй в том же порядке
 (то есть, если a и b есть в первой последовательности,
 при этом a идет "левее" b то и во второй они должны тоже быть и при этом a левее b).
 Например: {bcd} это подпоследовательность {A$%bGDFcLKKd}.
 Написать ф-ю, которая будет отвечать на вопрос, является ли одна последовательность подпоследовательностью другой.
 Ф-я принимает два String, возвращает boolean
 */
public class Subsequence {
    /**
     * @param first  - sequence
     * @param second - subsequence
     * @return is subsequence in sequence
     */
    public boolean isSubsequence(String first, String second) {
        // variant 1 with for
//        char[] chFirst = first.toCharArray();
//        char[] chSecond = second.toCharArray();
//        int count = 0;
//
//        for (int i = 0, j = 0; j < chSecond.length && i < chFirst.length; j++) {
//            if (chFirst[i] == chSecond[j]) {
//                count++;
//                i++;
//            }
//        }
//        if (count == chFirst.length) {
//            return true;
//        }

        //variant 2 with String - is this faster?
        char[] chFirst = first.toCharArray();
        int intSequence = -1; // if at place 0
        int count = 0;
        for (char ch : chFirst) {
            int temp = second.indexOf(ch);
            if (temp > intSequence) {
                intSequence = temp;
                count++;
            }
        }
        if (count == first.length()) {
            return true;
        }
        return false;
    }
}
