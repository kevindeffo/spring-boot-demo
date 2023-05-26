package com.springdemo.firstspringapp;

import com.springdemo.firstspringapp.student.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getAllStudents(){
        return List.of(
                new Student(
                        "Kevin",
                        "Deffo",
                        LocalDate.now(),
                        "deffokevin@gmail.com",
                        25
                ),
                new Student(
                        "Pierre",
                        "Simo",
                        LocalDate.now(),
                        "pierrekevin@gmail.com",
                        27
                )
        );
    }
}
