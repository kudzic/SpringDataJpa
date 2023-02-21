package com.SpringDataJpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name="tbl_courseMaterial")
public class CourseMaterial {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long courseMaterialId;
    private String url;
    @OneToOne(
            cascade = CascadeType.ALL

    )
    @JoinColumn(
            name="course_id",
            referencedColumnName = "courseId"
    )
    private Course course;
}
