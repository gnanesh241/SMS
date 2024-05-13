package com.example.SMS.Service;

import com.example.SMS.Entity.Student;
import com.example.SMS.Exception.ResourceNotFoundException;
import com.example.SMS.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));

        studentRepository.delete(student);
    }

    @Override
    public Student updateStudent(Long id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setPhoneNumber(updatedStudent.getPhoneNumber());
        existingStudent.setEmailAddress(updatedStudent.getEmailAddress());
        existingStudent.setAddress(updatedStudent.getAddress());
        existingStudent.setEmergencyContactName(updatedStudent.getEmergencyContactName());
        existingStudent.setEmergencyContactRelationship(updatedStudent.getEmergencyContactRelationship());
        existingStudent.setEmergencyContactPhoneNumber(updatedStudent.getEmergencyContactPhoneNumber());
        existingStudent.setMedicalInformation(updatedStudent.getMedicalInformation());
        existingStudent.setAdditionalNotes(updatedStudent.getAdditionalNotes());

        return studentRepository.save(existingStudent);
    }


}
