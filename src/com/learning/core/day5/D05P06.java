package com.learning.core.day5;
import java.util.TreeSet;

public class D05P06 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person(1, "Alice", 22, 1500.0));
        persons.add(new Person(2, "Bob", 28, 2000.0));
        persons.add(new Person(3, "Charlie", 32, 2500.0));
        persons.add(new Person(4, "David", 19, 1200.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));

        for (Person person : persons) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }
}