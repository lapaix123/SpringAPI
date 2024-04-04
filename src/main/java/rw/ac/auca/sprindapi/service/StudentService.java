package rw.ac.auca.sprindapi.service;

import rw.ac.auca.sprindapi.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    Student newStudent(Student student);
    Student getStudent(UUID id);
    Student updateStudent(UUID id, Student student);
    Student deleteStudent(UUID id);
    Student getStudentByStudentId(String studentId);
    List<Student> getallStudent();
}
