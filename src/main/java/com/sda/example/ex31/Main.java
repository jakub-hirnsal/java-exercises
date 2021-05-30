package com.sda.example.ex31;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("words.txt");
        String s = null;

        try {
            s = Files.readString(path);
        } catch (IOException exception) {
            exception.printStackTrace();
            System.exit(1);
        }

        Map<String, Long> stringLongMap = countWords(s);
        System.out.println(stringLongMap);

        StringBuilder builder = new StringBuilder();

        builder.append("---------------------\n");
        stringLongMap
                .forEach((key, value) -> builder
                        .append("|\t")
                        .append(key)
                        .append("\t| ")
                        .append(value)
                        .append("\t|\n"));
        builder.append("---------------------\n");

        try (PrintStream ps = new PrintStream(new FileOutputStream(new File("word_freq.txt")))) {
            ps.print(builder.toString());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static Map<String, Long> countWords(String input) {
        String[] split = input.split("[ .,\n]+");

        return Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
