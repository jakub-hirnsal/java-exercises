package com.sda.example.ex30;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.lang3.ArrayUtils;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("text.txt");
        System.out.println(path.toAbsolutePath());

        String fileName = path.getFileName().toString().split("\\.")[0];
        fileName = new StringBuilder(fileName).reverse().toString();
        System.out.println(fileName);

//        byte[] bytes = Files.readAllBytes(path);
        byte[] bytes = null;

        try (FileInputStream fis = new FileInputStream(new File("text.txt"))) {
            bytes = fis.readAllBytes();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        ArrayUtils.reverse(bytes);

        try (FileOutputStream fos = new FileOutputStream(new File(fileName + ".txt"))) {
            fos.write(bytes);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
