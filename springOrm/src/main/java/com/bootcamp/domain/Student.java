
package com.bootcamp.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class Student implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private Long idStudent;
    
    @Column(nullable=false, name = "firstname")
    private String firstName;
    
    @Column(nullable=false, name = "lastname")
    private String lastName;
    
    @Column(name = "registrationnumber")
    private int registrationNumber;
    
    @Column(name = "birthdate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthDate;

    protected Student(){}
    
    @Override
    public String toString() {
        return "Student{" + "idStudent=" + idStudent + ", fName=" + firstName + ", lName=" + lastName + ", registrationNumber=" + registrationNumber + ", birth date: " +  birthDate +'}';
    }
    
    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }
    
    public String getfName() {
        return firstName;
    }

    public void setfName(String fName) {
        this.firstName = fName;
    }
    
    public String getlName() {
        return lastName;
    }

    public void setlName(String lName) {
        this.lastName = lName;
    }
    
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Student(String firstName, String lastName, int registrationNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationNumber = registrationNumber;
        this.birthDate = birthDate;
    }
    
    
}
