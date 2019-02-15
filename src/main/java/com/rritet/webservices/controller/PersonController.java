package com.rritet.webservices.controller;

import com.rritet.webservices.model.Person;
import com.rritet.webservices.model.Student;
import com.rritet.webservices.service.PersonRepoService;
import com.rritet.webservices.service.StudentRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepoService personRepoService;

    @GetMapping
    public List<Person> getAllStudents(){
        return personRepoService.getAllPerson();
    }

    @GetMapping("/{id}")
    public Person getStudent(@PathVariable int id){
        return personRepoService.getPerson(id);
    }

    @PostMapping
    public void addStudent(@RequestBody Person person){
        personRepoService.addPerson(person);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
       return personRepoService.deletePerson(id);
    }

    @PutMapping
    public String updateStudentFirstName(@RequestParam(value = "id") int id,@RequestParam(value = "firstName") String firstName){
        return personRepoService.updatePersonFirstName(id,firstName);
    }



}
