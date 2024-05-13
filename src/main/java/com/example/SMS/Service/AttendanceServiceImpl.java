package com.example.SMS.Service;

import com.example.SMS.Entity.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SMS.Repository.AttendanceRepository;
import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    public List<Attendance> getAllAttendanceWithStudents() {
        return attendanceRepository.findAllWithStudents();
    }

    @Override
    public Attendance getAttendanceById(Long id) {
        return attendanceRepository.findById(id).orElse(null);
    }

    @Override
    public void saveOrUpdateAttendance(Attendance attendance) {
        attendanceRepository.save(attendance);
        System.out.println(attendance.toString());
    }

    @Override
    public void deleteAttendance(Long id) {
        attendanceRepository.deleteById(id);
    }
}
