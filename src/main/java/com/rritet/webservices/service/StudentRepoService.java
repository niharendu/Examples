package com.rritet.webservices.service;

import com.rritet.webservices.model.Student;
import com.rritet.webservices.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentRepoService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        List <Student> studentList = new ArrayList<Student>();
        for (Student student:studentRepository.findAll()) studentList.add(student);
        return studentList;
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public Student getStudent(int id){
        return studentRepository.findById(id).get();
    }

    public String deleteStudent(int id){
        Student student = getStudent(id);
        if(student!=null){
            studentRepository.deleteById(id);
            return "Student with id " +id+" and Name="+student.getFirstName()+" "+student.getLastName()+" is deleted";
        }
        return "No such Student with id="+id;
    }

    public String updateStudentFirstName(int id, String  firstName){

        for (Student elem:studentRepository.findAll()) {
            if(elem.getRollNo()==id) {
                elem.setFirstName(firstName);
                studentRepository.save(elem);
                return "Student " + elem.getRollNo() + " is updated";
            }
        }
        return "No such student found";
    }
}
