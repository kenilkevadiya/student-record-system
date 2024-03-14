package com.kenilsk.studentrecordsystem.service;

import com.kenilsk.studentrecordsystem.model.Student;
import com.kenilsk.studentrecordsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

}
