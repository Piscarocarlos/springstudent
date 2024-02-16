package site.acatech.student.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.acatech.student.models.Student;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryService implements StudentService{

    private InMemoryStudentDao inMemoryStudentDao;

    public InMemoryService(InMemoryStudentDao inMemoryStudentDao) {
        this.inMemoryStudentDao = inMemoryStudentDao;
    }

    @Override
    public List<Student> allStudents() {
        return inMemoryStudentDao.allStudents();
    }

    @Override
    public Student save(Student student) {
        return inMemoryStudentDao.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return inMemoryStudentDao.findByEmail(email);
    }

    @Override
    public void delete(String email) {
         inMemoryStudentDao.delete(email);
    }

    @Override
    public Student update(Student student) {
        return inMemoryStudentDao.update(student);
    }
}
