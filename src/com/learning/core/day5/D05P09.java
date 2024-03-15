package com.learning.core.day5;
import java.util.TreeSet;

public class D05P09 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person(1, "Jerry", 30, 999.0));
        persons.add(new Person(2, "Smith", 35, 2999.0));
        persons.add(new Person(3, "Popeye", 40, 5999.0));
        persons.add(new Person(4, "Jones", 45, 6999.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));

        double sum = persons.stream().mapToDouble(Person::getSalary).sum();
        System.out.println(sum);
    }
}