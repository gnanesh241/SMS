package com.example.SMS.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;

    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String address;
    private String department;
    private String qualification;
    private String additionalNotes;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public String getName() {
        return name;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public String getDepartment() {
        return department;
    }

    public String getQualification() {
        return qualification;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
