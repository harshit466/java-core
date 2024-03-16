package com.learning.core.day10;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class D10P03 {
    public static void main(String[] args) {
        List<Student> studentList = readStudentRecords("student_records.txt");
        if (studentList != null) {
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    private static List<Student> readStudentRecords(String fileName) {
        List<Student> studentList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    studentList.add(student);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            // End of file reached
        }
        return studentList;
    }
}
