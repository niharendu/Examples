package com.rritet.webservices.repository;

import com.rritet.webservices.model.Person;
import com.rritet.webservices.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {
}
