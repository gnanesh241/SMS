package com.example.SMS.Controller;

import com.example.SMS.Entity.Student;
import com.example.SMS.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://sms-kappa-sand.vercel.app/")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/getStudent")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }


    @PostMapping("/postStudent")
    public Student createStudent(@RequestBody Student student) {
        System.out.println(student);
        return studentService.createStudent(student);
    }


    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id, updatedStudent);
    }

}
