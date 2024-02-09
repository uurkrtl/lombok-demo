package net.ugurkartal;

import java.util.List;
import java.util.stream.Collectors;

public class UniversityService {

    //Write a function to calculate the average grade of a Course (Pass the Course as a parameter).
    public double calculateAverageGrade(Course course) {
        return course.getStudents().stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0);
    }

    //Write a function to calculate the average grade of the entire University (Pass a University object as a parameter).
    public double calculateAverageGrade(University university) {
        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0);
    }

    //Write a function that retrieves all students from a University with a minimum grade of 2/"Good" and returns them as a list (Pass a University object as a parameter).
    public List<Student> getGoodStudents(University university) {
        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getGrade() >= 2)
                .collect(Collectors.toList());
    }
}