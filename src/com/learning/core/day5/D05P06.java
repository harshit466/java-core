package com.learning.core.day5;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.id, o.id);
    }
}

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