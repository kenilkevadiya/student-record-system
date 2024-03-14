package com.kenilsk.studentrecordsystem.service;

import com.kenilsk.studentrecordsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
