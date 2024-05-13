package com.example.SMS.Repository;

import com.example.SMS.Entity.Attendance;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceRepository extends CrudRepository<Attendance,Long> {

    @Query("SELECT a FROM Attendance a JOIN FETCH a.student")
    List<Attendance> findAllWithStudents();
}
