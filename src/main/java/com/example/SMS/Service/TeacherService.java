package com.example.SMS.Service;

import com.example.SMS.Entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();

    Teacher getTeacherById(Long id);

    Teacher createTeacher(Teacher teacher);

    void deleteTeacher(Long id);

    Teacher updateTeacher(Long id, Teacher updatedTeacher);


}
