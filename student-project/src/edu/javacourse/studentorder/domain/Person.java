package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Person {
    protected String surName;
    protected String giveName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private Adress address;

    public Person() {
        System.out.println("Person is create");
    }

    public String getSurName() {
        return surName;
    }

    public String getPersonString(){
        return  surName + " " + giveName;
    }

    public String getSurName(String dep) {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGiveName() {
        return giveName;
    }

    public void setGiveName(String giveName) {
        this.giveName = giveName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }
}
