package stringjoiner.example1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoinerClassExample2 {
    public static void main(String[] args) {
        List<String> rgbList = Arrays.asList("Red", "Green", "Blue");
        String commaSeparatedRGB = rgbList.stream()
                .map(color -> color.toString())
                .collect(Collectors.joining(","));

        System.out.println(commaSeparatedRGB);
    }
}
