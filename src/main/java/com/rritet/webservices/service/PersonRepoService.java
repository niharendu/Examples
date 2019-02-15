package com.rritet.webservices.service;

import com.rritet.webservices.model.Person;
import com.rritet.webservices.model.Student;
import com.rritet.webservices.repository.PersonRepository;
import com.rritet.webservices.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonRepoService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPerson(){
        List <Person> personList = new ArrayList<Person>();
        for (Person student:personRepository.findAll()) personList.add(student);
        return personList;
    }

    public void addPerson(Person person){
        personRepository.save(person);
    }

    public Person getPerson(int id){
        return personRepository.findById(id).get();
    }

    public String deletePerson(int id){
        Person Person = getPerson(id);
        if(Person!=null){
            personRepository.deleteById(id);
            return "Person with id " +id+" and Name="+Person.getFirstName()+" "+Person.getLastName()+" is deleted";
        }
        return "No such Person with id="+id;
    }

    public String updatePersonFirstName(int id, String  firstName){

        for (Person elem:personRepository.findAll()) {
            if(elem.getId()==id) {
                elem.setFirstName(firstName);
                personRepository.save(elem);
                return "Person " + elem.getId() + " is updated";
            }
        }
        return "No such Person found";
    }
}
