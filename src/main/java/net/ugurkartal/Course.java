package net.ugurkartal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Course {
    private long id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}
