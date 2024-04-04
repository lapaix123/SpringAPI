package rw.ac.auca.sprindapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

import java.util.Date;
import java.util.UUID;
@Data
@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private Date dob;
    private String address;
}
