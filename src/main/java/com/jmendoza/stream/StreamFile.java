package com.jmendoza.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFile {
    public static void main(String[] args) throws IOException {

        //System.out.println(FileSystems.getDefault().getPath("").toAbsolutePath());

        Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();

        List<String> stringArray = Files.lines(Paths.get("data.txt"))
                .flatMap(s -> Arrays.stream(s.split(",")))
                .collect(Collectors.toList());
        System.out.println("stringArray: " + stringArray.toString());

        List<String> list = Files.lines(Paths.get("data2.txt"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
