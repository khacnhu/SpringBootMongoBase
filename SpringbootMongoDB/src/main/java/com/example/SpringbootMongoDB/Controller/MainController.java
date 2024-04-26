package com.example.SpringbootMongoDB.Controller;

import com.example.SpringbootMongoDB.Model.Student;
import com.example.SpringbootMongoDB.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {


    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/addStudent")
    public void addStudents(@RequestBody Student student) {
        studentRepo.save(student);
    }


    @GetMapping("/fetchStudents")
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    @GetMapping("/getStudents/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentRepo.findById(id).orElse(null);
    }

    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student){
        Student std = studentRepo.findById(id).orElse(null);
        if (std != null) {
            std.setName(student.getName());
            std.setAddress(student.getAddress());

            return studentRepo.save(std);

        }
        return null;
    }

    @DeleteMapping("/deletedStudent/{id}")
    public Student deleteStudent(@PathVariable Integer id){
        Student std = studentRepo.findById(id).orElse(null);
        if (std != null) {
            studentRepo.delete(std);
        }
        return null;
    }



}
