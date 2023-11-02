package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") int id) {
        Student s = studentRepository.findById(id);
        studentRepository.delete(s);
    }

    @GetMapping("/all")
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping(value = "/count")
    public long countStudents() {
        return studentRepository.count();
    }

    @GetMapping(value = "/byYear")
    public Collection<?> findByYear() {
        return studentRepository.findNbrStudentByYear();
    }
}
