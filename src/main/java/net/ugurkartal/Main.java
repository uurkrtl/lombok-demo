package net.ugurkartal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "John Doe", "Math");
        Teacher teacher2 = new Teacher(2, "Jane Doe", "Science");
        Student student1 = new Student(1, "Alice", "1234", 90);
        Student student2 = new Student(2, "Bob", "5678", 80);
        Student student3 = new Student(3, "Charlie", "91011", 70);
        Course course1 = new Course(1, "Math", teacher1, List.of(student1, student2));
        Course course2 = new Course(2, "Science", teacher2, List.of(student2, student3));

        System.out.println("Course 1: " + course1);
        System.out.println("Course 2: " + course2);
        System.out.println("Student 1: " + student1);
        System.out.println("Student1.getName(); " + student1.getName());
        student1.setName("Alice Wonderland");
        System.out.println("After setName() the name of student1: " + student1.getName());
    }
}