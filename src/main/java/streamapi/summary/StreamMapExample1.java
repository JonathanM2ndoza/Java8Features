package streamapi.summary;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The following example shows how to retrieve values from the Map using the map() method of the Stream.
 */
public class StreamMapExample1 {
    public static void main(String[] args) {
        Map<String, String> colors = new HashMap<>();
        colors.put("#000000", "BLACK");
        colors.put("#FF0000", "RED");
        colors.put("#800000", "MAROON");
        colors.put("#FFFF00", "YELLOW");
        colors.put("#C0C0C0", "SILVER");
        colors.put("#808000", "OLIVE");
        colors.put("#808000", "OLIVE");

        // Normal method to get keys
        Set<String> colorHexCodes = getColorHexCodes(colors);
        System.out.println(colorHexCodes);

        // Using Stream map() method to get color names
        Set<String> colorNames = getColorNames(colors);
        System.out.println(colorNames);
    }

    private static Set<String> getColorHexCodes(Map<String, String> colors) {
        return colors.keySet();
    }

    private static Set<String> getColorNames(Map<String, String> colors) {
        Set<String> colorNames = colors.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toSet());
        return colorNames;
    }
}
