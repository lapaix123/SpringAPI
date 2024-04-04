package rw.ac.auca.sprindapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.ac.auca.sprindapi.model.Student;

import java.util.UUID;

public interface StudentDao extends JpaRepository<Student,UUID> {
}
