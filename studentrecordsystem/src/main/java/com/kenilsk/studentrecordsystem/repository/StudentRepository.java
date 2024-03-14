package com.kenilsk.studentrecordsystem.repository;

import com.kenilsk.studentrecordsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}


// Repositories in Spring:
// In Spring applications, repositories act as an abstraction layer between your data access logic and the underlying database.
// They provide methods for performing common operations on data, like saving, retrieving, updating, and deleting.

//@Repository Annotation:
// This annotation tells Spring that the interface it's applied to is a repository bean.
// This allows Spring to automatically configure and manage the bean for you, including creating an instance and injecting it where needed.