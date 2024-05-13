package com.example.SMS.Service;

import com.example.SMS.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student createStudent(Student student);

    void deleteStudent(Long id);

    Student updateStudent(Long id, Student student);
}
