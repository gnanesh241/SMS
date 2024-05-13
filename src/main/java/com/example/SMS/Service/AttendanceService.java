package com.example.SMS.Service;

import com.example.SMS.Entity.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AttendanceService {
//    List<Attendance> getAllAttendances();
    Attendance getAttendanceById(Long id);
    void saveOrUpdateAttendance(Attendance attendance);
    void deleteAttendance(Long id);
    List<Attendance> getAllAttendanceWithStudents();
}
