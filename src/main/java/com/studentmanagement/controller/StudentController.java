package com.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studentmanagement.entities.StudentEntity;
import com.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

//    @Autowired
	@Autowired(required = false)
    private StudentService studentService;

    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public StudentEntity saveStudent(@RequestBody StudentEntity student) {
        return studentService.saveStudent(student);
    }
    
    @PutMapping("/{id}")
    public StudentEntity updateStudent(@PathVariable int id, @RequestBody StudentEntity updatedStudent) {
        return studentService.updateStudent(id, updatedStudent);
    }


    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
    
    
}
