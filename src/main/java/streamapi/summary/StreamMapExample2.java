package streamapi.summary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The following example converts the elements of list to uppercase using the map() method of the Stream.
 */
public class StreamMapExample2 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Violet");
        colors.add("Indigo");
        colors.add("Green");

        // Using normal method to convert color names to upper-case
        List<String> list1 = getColorInUpperCase1(colors);
        System.out.println(list1);

        // Using Stream map() method to convert color names to upper-case
        List<String> list2 = getColorInUpperCase2(colors);
        System.out.println(list2);
    }

    private static List<String> getColorInUpperCase1(List<String> colors) {
        List<String> list = new ArrayList<>();
        for (String color : colors) {
            list.add(color.toUpperCase());
        }
        return list;
    }

    private static List<String> getColorInUpperCase2(List<String> colors) {
        List<String> list = colors.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
        return list;
    }

}
