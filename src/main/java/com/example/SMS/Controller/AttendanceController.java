package com.example.SMS.Controller;

import com.example.SMS.Entity.Attendance;
import com.example.SMS.Entity.Student;
import com.example.SMS.Service.AttendanceService;
import com.example.SMS.Service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

class StudentWithId{
    private long student_id;
    private Date date;
    private String status;

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public long getStudent_id() {
        return student_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "StudentWithId{" +
                "student_id=" + student_id +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
@CrossOrigin(origins = "https://sms-kappa-sand.vercel.app/")
@RestController
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAttendance")
    public List<Attendance> getAllAttendanceWithStudents() {
        return attendanceService.getAllAttendanceWithStudents();
    }
    @GetMapping("/getAttendance/{id}")
    public Attendance getAttendanceById(@PathVariable Long id) {
        return attendanceService.getAttendanceById(id);
    }

    @PostMapping("/postAttendance")
    public void addAttendance(@RequestBody StudentWithId attendance) {
        System.out.println(attendance);
        Student student = studentService.getStudentById(attendance.getStudent_id());
       Attendance attendance1 = new Attendance(student,attendance.getDate(),attendance.getStatus());
       attendanceService.saveOrUpdateAttendance(attendance1);

    }

    @PutMapping("/updateAttendance/{id}")
    public void updateAttendance(@PathVariable Long id, @RequestBody Attendance attendance) {
        attendance.setId(id);
        attendanceService.saveOrUpdateAttendance(attendance);
    }

    @DeleteMapping("/deleteAttendance/{id}")
    public void deleteAttendance(@PathVariable Long id) {
        attendanceService.deleteAttendance(id);
    }
}
