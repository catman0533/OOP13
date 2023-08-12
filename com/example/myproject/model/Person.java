package com.example.myproject.model;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.Iterator;
import java.util.List;

public class Person implements FamilyMember, Serializable {
    private String name;
    private String gender;
    private String birthDate;
    private String deathDate;
    private List<Person> parents;
    private List<Person> children;

    public Person(String name, String gender, String birthDate, String deathDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public List<Person> getParents() {
        return parents;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addParent(Person parent) {
        parents.add(parent);
    }

    public void addChild(Person child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", deathDate='" + deathDate + '\'' +
                '}';
    }@Override
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        
        // Assuming birthDate is in "YYYY-MM-DD" format
        LocalDate birthLocalDate = LocalDate.parse(birthDate);
        
        if (deathDate != null) {
            // Assuming deathDate is in "YYYY-MM-DD" format
            LocalDate deathLocalDate = LocalDate.parse(deathDate);
            return Period.between(birthLocalDate, deathLocalDate).getYears();
        } else {
            return Period.between(birthLocalDate, currentDate).getYears();
        } 
    }
}
    