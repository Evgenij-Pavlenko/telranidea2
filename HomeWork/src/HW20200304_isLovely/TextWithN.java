package HW20200304_isLovely;

import java.util.Arrays;

public class TextWithN {

    public String makeNewText (String s, int N){
        if (N>=s.length()){
            return s;
        }
        for (int i = N; i >=0 ; i--) {
            if (s.charAt(i)==' '){
            return s.substring(0, i).trim();
            }
        }
return "";

//        s.chars()
//                .limit(N)
//                .
//        String[] strArr = s.split(" ");
//       return Arrays.stream(strArr)
//                .filter(str->str.length()<=N).findFirst().orElse("");

    }
}
