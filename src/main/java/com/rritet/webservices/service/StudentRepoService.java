package com.rritet.webservices.service;

import com.rritet.webservices.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentRepoService {

    //StudentRepository studentRepository;
    List <Student> studentList = new ArrayList<Student>();

    public List<Student> getAllStudents(){
        return studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public Student getStudent(int id){
        for (Student elem:studentList) {
            if(elem.getRollNo()==id)
                return elem;

        }
        return null;
    }

    public String deleteStudent(int id){
        for (Student elem:studentList) {
            if(elem.getRollNo()==id) {
                studentList.remove(elem);
                return "Student " + elem.getFirstName() + " " + elem.getLastName() + " is revmoved";
            }
        }
        return "No such student found";
    }

    public String updateStudentFirstName(int id, String  firstName){
        for (Student elem:studentList) {
            if(elem.getRollNo()==id) {
                studentList.get(studentList.indexOf(elem)).setFirstName(firstName);
                return "Student " + elem.getRollNo() + " is update";
            }
        }
        return "No such student found";
    }
}
