package com.learning.core.day10;
import java.io.IOException;
import java.nio.file.*;

public class D10P04 {
    public static void main(String[] args) {
        Path source = Paths.get("student_records.txt");
        Path destination = Paths.get("destination.txt");

        try {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (NoSuchFileException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Failed to copy file: " + e.getMessage());
        }
    }
}
