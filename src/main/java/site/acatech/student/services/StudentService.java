package site.acatech.student.services;

import org.springframework.stereotype.Service;
import site.acatech.student.models.Student;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> allStudents() {
        return List.of(
                new Student("Carlos", "Alognon", LocalDate.now(), "carlos@gmail.com")
        );
    }
}
