package ChangeCase;

/*
2. Есть строка. Вернуть новую строку, у которой большие буквы стали маленькими и наоборот.
 */
public class ChangeCase {
    public String changeCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String temp = String.valueOf(ch);
            if (ch > 64 && ch < 91) { //A-Z
                sb.append(temp.toLowerCase());
            } else if (ch > 96 && ch < 123) { //a-z
                sb.append(temp.toUpperCase());
            } else {
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}
