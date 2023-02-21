package com.SpringDataJpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="tbl_course")
public class Course {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long courseId;
    private String title;
    private Integer credit;

}
