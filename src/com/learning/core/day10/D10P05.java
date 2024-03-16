package com.learning.core.day10;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class D10P05 {
    public static void main(String[] args) {
        // Accept string input from user
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter string:");
        String input =sc.nextLine();

        // Write the string input to the file io.txt
        try (PrintWriter writer = new PrintWriter("io.txt")) {
            writer.println(input);
            System.out.println("String input written to file io.txt.");
        } catch (IOException e) {
            System.out.println("Failed to write to file: " + e.getMessage());
        }

        try {
            Path path = Paths.get("io.txt");
            long size = Files.size(path);
            System.out.println("Size of the file io.txt: " + size + " bytes.");
        } catch (IOException e) {
            System.out.println("Failed to get file size: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("io.txt"))) {
            String line;
            System.out.println("Contents of the file io.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Failed to read from file: " + e.getMessage());
        }


        File file = new File("io.txt");
        if (file.delete()) {
            System.out.println("File io.txt deleted successfully.");
        } else {
            System.out.println("Failed to delete file io.txt.");
        }
    }
}