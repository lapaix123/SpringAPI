package rw.ac.auca.sprindapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.ac.auca.sprindapi.model.Teacher;

import java.util.UUID;

public interface TeacherRepository extends JpaRepository<Teacher, UUID> {
}