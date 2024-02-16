package site.acatech.student.services;
import site.acatech.student.models.Student;
import java.util.List;
public interface StudentService {
    List<Student> allStudents();

    Student save(Student student);

    Student findByEmail(String email);

    void delete(String email);

    Student update(Student student);
}
