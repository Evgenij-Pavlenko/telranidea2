import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

class StringHandling {
    public static void main(String[] args) {
//        System.out.println(longestAlpabeticalSubstring("asd"));
        System.out.println(longestAlpabeticalSubstring("nab"));
        System.out.println(longestAlpabeticalSubstring("abcdeapbcdef"));
    }

    public static String longestAlpabeticalSubstring(String text) {
        // Your code here
        StringBuilder sbRet = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            StringBuilder sbTemp = new StringBuilder();
            sbTemp.append(text.charAt(i));
            for (int j = i + 1; j < text.length(); j++) {
                char lastSb = sbTemp.charAt(sbTemp.length() - 1);
                char c = text.charAt(j);
                if (c >= lastSb) {
                    sbTemp.append(c);
                } else{
                    break;
                }
            }
            if (sbTemp.length() > sbRet.length()) {
                sbRet = sbTemp;
            }
        }
        return sbRet.toString();
    }
}