package com.example.SMS.Service;

import com.example.SMS.Entity.Teacher;
import com.example.SMS.Exception.ResourceNotFoundException;
import com.example.SMS.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class TeacherServiceImpl implements TeacherService {

        @Autowired
        private TeacherRepository teacherRepository;

        @Override
        public List<Teacher> getAllTeachers() {
            return (List<Teacher>) teacherRepository.findAll();
        }
        @Override
        public Teacher getTeacherById(Long id) {
            return teacherRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Teacher", "id", id));
        }
        @Override
        public Teacher createTeacher(Teacher teacher) {
            return teacherRepository.save(teacher);
        }

        @Override
        public void deleteTeacher(Long id) {
            Teacher teacher = teacherRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Teacher", "id", id));

            teacherRepository.delete(teacher);
        }
        @Override
        public Teacher updateTeacher(Long id, Teacher updatedTeacher) {
            Teacher existingTeacher = teacherRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Teacher", "id", id));

            // Update the fields of the existing teacher with the values from the updatedTeacher
            existingTeacher.setName(updatedTeacher.getName());
            existingTeacher.setPhoneNumber(updatedTeacher.getPhoneNumber());
            existingTeacher.setEmailAddress(updatedTeacher.getEmailAddress());
            existingTeacher.setAddress(updatedTeacher.getAddress());
            existingTeacher.setDepartment(updatedTeacher.getDepartment());
            existingTeacher.setQualification(updatedTeacher.getQualification());
            existingTeacher.setAdditionalNotes(updatedTeacher.getAdditionalNotes());

            return teacherRepository.save(existingTeacher);
        }


}
