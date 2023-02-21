package com.SpringDataJpa.Repository;

import com.SpringDataJpa.Entity.Guardian;
import com.SpringDataJpa.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private  StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student= Student.builder()
                .emailId("chidzodzok@gmail.com")
                .firstName("Kudzai")
                .lastName("Chidzodzo")
//                .GuardianEmail("chidzodzok@gmail.com")
//                .GuardianMobile("539783341")
//                .guardianName("Kudzai")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void saveWithGuardian(){
        Guardian guardian=Guardian.builder()
                .name("Kudzai")
                .email("chidzodzoj@gmail.com")
                .mobile("539783341")
                .build();
        Student student=Student.builder()
                .emailId("chidzodzoj@gmail.com")
                .firstName("Kudzai")
                .lastName("Chidzodzo")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    void findByFirstNameContaining() {
        List<Student> student=
                studentRepository.findByFirstNameContaining("kudz");
        System.out.println("Students"+ student);
    }

    @Test
    void findByFirstName() {
        List<Student> student=studentRepository.findByFirstName("Kudzai");
        System.out.println("Students " + student);
    }
}