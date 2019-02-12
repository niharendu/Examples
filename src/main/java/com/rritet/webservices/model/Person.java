package com.rritet.webservices.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "moddle__name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "race")
    private String race;

    @Column(name = "sex")
    private char sex;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "marital_status")
    private char marital_status;

    @Column(name = "vetran")
    private String vetran;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(char marital_status) {
        this.marital_status = marital_status;
    }

    public String getVetran() {
        return vetran;
    }

    public void setVetran(String vetran) {
        this.vetran = vetran;
    }

    public Date getDtCeated() {
        return dtCeated;
    }

    public void setDtCeated(Date dtCeated) {
        this.dtCeated = dtCeated;
    }

    public Date getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(Date dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    @Column(name = "dt_created")
    Date dtCeated;

    @Column(name = "dt_update")
    Date dtUpdate;


}