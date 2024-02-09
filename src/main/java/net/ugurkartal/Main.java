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

        Teacher teacher3 = Teacher.builder().id(3).name("John Doe").subject("Math").build();
        Teacher teacher4 = Teacher.builder().id(4).name("Jane Doe").subject("Science").build();
        Student student4 = Student.builder().id(4).name("Alice").address("1234").grade(90).build();
        Student student5 = Student.builder().id(5).name("Bob").address("5678").grade(80).build();
        Course course3 = Course.builder().id(3).name("Math").teacher(teacher3).students(List.of(student4, student5)).build();
        Course course4 = Course.builder().id(4).name("Science").teacher(teacher4).students(List.of(student5, student3)).build();

        System.out.println("***Test: toString() with @Data***");
        System.out.println("Course 1: " + course1);
        System.out.println("Course 2: " + course2);
        System.out.println("Student 1: " + student1);

        "---".repeat(10).lines().forEach(System.out::println);

        System.out.println("***Test: Getter and Setter with @Data***");
        System.out.println("Student1.getName(); " + student1.getName());
        student1.setName("Alice Wonderland");
        System.out.println("After setName() the name of student1: " + student1.getName());

        "---".repeat(10).lines().forEach(System.out::println);

        System.out.println("***Test: new Object with @Builder***");
        System.out.println("Course 3: " + course3);
        System.out.println("Course 4: " + course4);

        "---".repeat(10).lines().forEach(System.out::println);

        System.out.println("***Test: Change with @With***");
        System.out.println("Student 5 before withGrade(): " + student5);
        student5.withGrade(100);
        System.out.println("After withGrade() the grade of student5: " + student5.getGrade());
    }
}