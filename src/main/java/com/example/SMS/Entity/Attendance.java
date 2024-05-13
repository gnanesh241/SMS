package com.example.SMS.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private Student student;


    @Column(name = "date")
    private Date date;

    @Column(name = "status")
    private String status;

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public Student getStudent() {
        return student;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public Attendance(){

    }

    public Attendance(Student student, Date date, String status) {

        this.student = student;
        this.date = date;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", student=" + (student != null ? student.getStudentId() : "null") +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
