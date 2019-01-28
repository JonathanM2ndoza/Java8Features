package streamapi.summary;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterMapExample {
    public static void main(String[] args) {
        Map<Integer, String> days = new HashMap<>();
        days.put(1, "Sunday");
        days.put(2, "Monday");
        days.put(3, "Tuesday");
        days.put(4, "Wednesday");
        days.put(5, "Thursday");
        days.put(6, "Friday");
        days.put(7, "Saturday");

        // Old method filtering map
        Map<Integer, String> result1 = getFilteredMap(days, "T");
        System.out.println(result1);

        // Using Stream filter method
        Map<Integer, String> result2 = getStreamFilteredMap(days, "S");
        System.out.println(result2);
    }

    private static Map<Integer, String> getFilteredMap(Map<Integer, String> days, String s) {
        Map<Integer, String> result = new HashMap<>();
        for (Entry<Integer, String> day : days.entrySet()) {
            if (day.getValue().startsWith(s)) {
                result.put(day.getKey(), day.getValue());
            }
        }
        return result;
    }

    private static Map<Integer, String> getStreamFilteredMap(Map<Integer, String> days, String s) {
        // Get Stream from map
        Stream<Entry<Integer, String>> stream = days.entrySet().stream();
        // Filter entry set
        Map<Integer, String> result = stream.filter((e) -> e.getValue().startsWith(s)).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
        return result;
    }
}
