package site.acatech.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import site.acatech.student.models.Student;
import site.acatech.student.services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {


    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> findAllStudents() {
       return studentService.allStudents();
    }

    @PostMapping(path = "/store")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email) {
        return studentService.findByEmail(email);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.update(student);
    }

    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable("email") String email) {
        studentService.delete(email);
    }
}
