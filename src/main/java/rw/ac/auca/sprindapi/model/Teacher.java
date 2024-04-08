package rw.ac.auca.sprindapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;
@Data
@Entity
public class Teacher {
    @Id
    private UUID uuid;
    private String teacherId;
    private String fullNames;
    private String qualification;
    private String email;
    private String phoneNumber;

}
