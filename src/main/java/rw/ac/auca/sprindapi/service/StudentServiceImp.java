package rw.ac.auca.sprindapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.ac.auca.sprindapi.dao.StudentDao;
import rw.ac.auca.sprindapi.model.Student;

import java.util.List;
import java.util.UUID;
@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    private StudentDao dao;
    @Override
    public Student newStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudent(UUID id) {
        return null;
    }

    @Override
    public Student updateStudent(UUID id, Student student) {
        return null;
    }

    @Override
    public Student deleteStudent(UUID id) {
        return null;
    }

    @Override
    public Student getStudentByStudentId(String studentId) {
        return null;
    }

    @Override
    public List<Student> getallStudent() {
        return null;
    }
}
