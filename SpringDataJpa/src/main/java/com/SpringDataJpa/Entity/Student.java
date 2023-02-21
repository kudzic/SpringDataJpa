package com.SpringDataJpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(
        name="tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "emailid_unique",
                columnNames = "email_address"
        )
)

public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(name="email_address",
            nullable = false)

    private String emailId;
    @Embedded
    private Guardian guardian;
}
