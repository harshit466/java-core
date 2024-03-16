package com.learning.core.day10;
import java.io.*;
import java.util.Scanner;

public class D10P01 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileCopy <source_file> <destination_file>");
            return;
        }

        String sourceFile = args[0];
        String destFile = args[1];

        File source = new File(sourceFile);
        if (!source.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        File dest = new File(destFile);
        if (dest.exists()) {
            System.out.print("Destination file already exists. Do you want to overwrite? (Yes/No): ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine().trim().toLowerCase();
            if (!choice.equals("yes")) {
                System.out.println("Copying aborted.");
                scanner.close();
                return;
            }
            scanner.close();
        }

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}