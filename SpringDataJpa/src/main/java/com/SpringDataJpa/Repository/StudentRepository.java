package com.SpringDataJpa.Repository;

import com.SpringDataJpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByFirstNameContaining(String name);
    List<Student>findByFirstName(String name);

}
