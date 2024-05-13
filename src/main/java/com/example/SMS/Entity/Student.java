package com.example.SMS.Entity;

import com.example.SMS.Service.AttendanceService;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String address;
    private String emergencyContactName;
    private String emergencyContactRelationship;
    private String emergencyContactPhoneNumber;
    private String medicalInformation;
    private String additionalNotes;

    @OneToMany(mappedBy = "student")
    private List<Attendance> attendances;

    public Long getStudentId() {
        return studentId;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public String getEmergencyContactPhoneNumber() {
        return emergencyContactPhoneNumber;
    }

    public String getEmergencyContactRelationship() {
        return emergencyContactRelationship;
    }

    public String getMedicalInformation() {
        return medicalInformation;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) {
        this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
    }

    public void setEmergencyContactRelationship(String emergencyContactRelationship) {
        this.emergencyContactRelationship = emergencyContactRelationship;
    }

    public void setMedicalInformation(String medicalInformation) {
        this.medicalInformation = medicalInformation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", address='" + address + '\'' +
                ", emergencyContactName='" + emergencyContactName + '\'' +
                ", emergencyContactRelationship='" + emergencyContactRelationship + '\'' +
                ", emergencyContactPhoneNumber='" + emergencyContactPhoneNumber + '\'' +
                ", medicalInformation='" + medicalInformation + '\'' +
                ", additionalNotes='" + additionalNotes + '\'' +
                ", attendances=" + attendances +
                '}';
    }
}
