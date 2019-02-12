package com.rritet.webservices.controller;

import com.rritet.webservices.model.Student;
import com.rritet.webservices.service.StudentRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepoService studentRepoService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepoService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){
        return studentRepoService.getStudent(id);
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentRepoService.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
       return studentRepoService.deleteStudent(id);
    }

    @PutMapping
    public String updateStudentFirstName(@RequestParam(value = "id") int id,@RequestParam(value = "firstName") String firstName){
        return studentRepoService.updateStudentFirstName(id,firstName);
    }



}
