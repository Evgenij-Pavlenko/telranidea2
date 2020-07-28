import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>(Arrays .asList(-8,1,-5,1,2,7,-5,1));
        System.out.println(doubleIntSet(testList));
    }

    public static String reverceString1(String str) {
        StringBuilder sb = new StringBuilder(str);
        return String.valueOf(sb.reverse());
    }

    public static String reverceString2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return String.valueOf(sb);
    }

    public static String changeCase(String str) {
        System.out.println("hello");
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (!Character.isUpperCase(ch[i])) {
                ch[i] = Character.toUpperCase(ch[i]);
            } else if (!Character.isLowerCase(ch[i])) {
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }
        return String.valueOf(ch);
    }

//    public static List<Integer> doubleInt(List<Integer> list) {
//        List<Integer> retInt = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i) == list.get(j)) {
//                    retInt.add(list.get(i));
//                }
//            }
//
////            if (list.contains(list.get(i))){
////                retInt.add(list.get(i));
////            }
//
//        }
//        return retInt;
//    }

    //доделать в O(n) вместо O(n*square)
    public static List<Integer> doubleIntSet(List<Integer> list) {
        Set<Integer> setInt = new HashSet<>();
        List<Integer> retInt = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
           if(!setInt.add(list.get(i)) && !retInt.contains(list.get(i))){
               retInt.add(list.get(i));
           }
        }
        return retInt;
    }
}
