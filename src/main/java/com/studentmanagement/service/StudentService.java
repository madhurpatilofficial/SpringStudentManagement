package com.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.daorepo.StudentRepository;
import com.studentmanagement.entities.StudentEntity;

@Service
public class StudentService {

//    @Autowired
	@Autowired(required = false)
    private StudentRepository studentRepository;

    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    public StudentEntity getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    public StudentEntity updateStudent(int id, StudentEntity updatedStudent) {
        Optional<StudentEntity> optionalStudent = studentRepository.findById(id);

        if (optionalStudent.isPresent()) {
            StudentEntity existingStudent = optionalStudent.get();
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setBranch(updatedStudent.getBranch());
            return studentRepository.save(existingStudent);
        } else {
            return null; // Handle the case where the student with the given ID is not found.
        }
    }
}
