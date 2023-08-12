package com.example.myproject.view;
import com.example.myproject.model.Person;
import java.util.List;

public interface FamilyView {
    void displayFamilyTree(List<Person> familyMembers);
    void displayErrorMessage(String errorMessage);
    void displayFamilyMembers(List<Person> familyMembers);
}

