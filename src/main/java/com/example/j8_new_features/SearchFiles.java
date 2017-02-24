package com.example.j8_new_features;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

public class SearchFiles
{
    public static void main(String[] args)
    {
        Path path = FileSystems.getDefault().getPath("C:/Workspace/testapp/src/main/resources/Files/example.txt");
        String searchTerm = "CONAL";

        try (Stream<String> lines = Files.lines(path)) {
            // a string that might or might not exist
            Optional<String> optional = lines.filter(l -> l.contains(searchTerm)).findFirst();
            if (optional.isPresent()) {
                System.out.println("Found: " + optional.get());
            } else {
                System.out.println("Not found");
            }
        } catch (Exception e) {
            System.out.println("ERROR!" + e);
        }
    }
}
