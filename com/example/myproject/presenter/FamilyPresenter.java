package com.example.myproject.presenter;

import com.example.myproject.presenter.FamilyPresenter;
import com.example.myproject.model.Person;

import java.util.List;

public interface FamilyPresenter {
    void addFamilyMember(String name);
     void displayFamilyMembers();
    List<Person> getFamilyMembers();
}