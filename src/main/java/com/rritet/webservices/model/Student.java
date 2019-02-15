package com.rritet.webservices.model;


import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT" )
public class Student {

    @Id
    @Column(name = "rollNo")
    private int rollNo;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;

    public int getRollNo() {
        return rollNo;
    }

    @JsonSetter(value = "rollNo")
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    @JsonSetter(value = "firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @JsonSetter(value = "lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
