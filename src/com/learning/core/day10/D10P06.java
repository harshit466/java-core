package com.learning.core.day10;
import java.io.*;

public class D10P06 {
    public static void main(String[] args) {
        try (BufferedReader englishReader = new BufferedReader(new FileReader("src/com/learning/core/day10/DavidEnglish.txt"));
             BufferedReader scienceReader = new BufferedReader(new FileReader("src/com/learning/core/day10/DavidScience.txt"));
             BufferedReader computerReader = new BufferedReader(new FileReader("src/com/learning/core/day10/DavidComputer.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("DavidNotes.txt"))) {

            String line;
            while ((line = englishReader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            
            while ((line = scienceReader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            
            while ((line = computerReader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Combined notes written to DavidNotes.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
