package stringSymbol;

/*
3. Есть строка, которая состоит из символов: []{}(). Определить, корректно ли стоят скобки
 */

import java.util.*;

public class StringSymbol {

    public boolean isCorrect(String str) {
//        Map<Character, Character> map = new HashMap<>();
//        map.put('[', ']');
//        map.put('{', '}');
//        map.put('(', ')');
        Deque q = new ArrayDeque();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char thC = ch[i];
            if (thC == '[' || thC == '{' || thC == '(') {
                q.add(thC);
            } else {
                char fromQ = (char) q.getLast();
                if (fromQ == '[' && thC == ']' ||
                        fromQ == '{' && thC == '}' ||
                        fromQ == '(' && thC == ')') {
                    q.removeLast();
                }
            }
        }
        if (q.size() == 0) {
            return true;
        }
        return false;
    }
}
