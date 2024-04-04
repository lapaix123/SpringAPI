package rw.ac.auca.sprindapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rw.ac.auca.sprindapi.model.Student;
import rw.ac.auca.sprindapi.service.StudentService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/newStudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student newStudent=studentService.newStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }
    @GetMapping("/allStudent")
    public ResponseEntity<List<Student>> viewStudent(){
       List<Student> viewStudent=studentService.getallStudent();
        return ResponseEntity.ok(viewStudent);

    }
    @DeleteMapping("/deleteStudent/{uuid}")
    public ResponseEntity<Student> deleteStudent(@PathVariable UUID uuid){
        Student deleteStudent= studentService.deleteStudent(uuid);
        return ResponseEntity.ok(deleteStudent);

    }


}
