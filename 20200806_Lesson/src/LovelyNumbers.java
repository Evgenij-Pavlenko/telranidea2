import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LovelyNumbers {
    public boolean isLovely(long number){
        // variant 1
//        Map<Character,Integer> occurrenceByDigit = new HashMap<>();
//        char[] didgits = String.valueOf(number).toCharArray();
//
//        for (char digit:didgits){
//            occurrenceByDigit.computeIfPresent(digit, (key, oldValue) -> oldValue+1);
//            occurrenceByDigit.putIfAbsent(digit,1);
//            if (occurrenceByDigit.get(digit)>2){
//                return false;
//            }
//        }
//        return true;

        //variant 2
        return String.valueOf(number).chars()
                .boxed() // make char -> Character
                .collect(Collectors.groupingBy(digit ->digit, Collectors.counting()))
                .values()
                .stream()
                .allMatch(occurrence -> occurrence<=2);
    }
}
