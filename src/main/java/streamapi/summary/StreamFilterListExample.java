package streamapi.summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterListExample {
    public static void main(String[] args) {
        List<String> days = Arrays.asList(new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"});

        // Filter list using old method
        List<String> filteredDays1 = getFilteredDays(days, "T");
        System.out.println("Filter list using old method: "+filteredDays1);

        // Filter list using stream filter() method
        List<String> filteredDays2 = getStreamFilteredDays(days, "S");
        System.out.println("Filter list using stream filter() method: "+filteredDays2);
    }

    private static List<String> getFilteredDays(List<String> days, String str) {
        List<String> list = new ArrayList<>();
        for (String day : days) {
            if (day.startsWith(str)) {
                list.add(day);
            }
        }
        return list;
    }

    private static List<String> getStreamFilteredDays(List<String> days, String str) {
        // Get Stream from list
        Stream<String> stream = days.stream();
        // Filter days list
        List<String> list = stream.filter((day) -> day.startsWith(str)).collect(Collectors.toList());
        return list;
    }
}
