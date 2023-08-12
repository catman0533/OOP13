package com.example.myproject.presenter;



import java.util.List;
import com.example.myproject.model.Person;
import com.example.myproject.view.FamilyView;
import com.example.myproject.model.FamilyTree;


public class FamilyPresenterImpl implements FamilyPresenter {
    private FamilyView view;
    private FamilyTree<Person> model;
    
    public FamilyPresenterImpl(FamilyView view, FamilyTree<Person> model) {
        this.view = view;
        this.model = model;
    }
    
    @Override
    public void addFamilyMember(String name) {
        Person person = new Person(name, // gender
                                   // birthDate
                                   null, // deathDate
                                   null, // parents
                                   null); // children
        model.addPerson(person);
    }

    @Override
    public List<Person> getFamilyMembers() {
        List<Person> people = model.getPeople();
        return people;
    }
        @Override
      public void displayFamilyMembers() {
        // ваш код для отображения членов семьи
        // например, можно использовать поле view для отображения информации
        List<Person> familyMembers = model.getPeople();
        view.displayFamilyMembers(familyMembers);
    }

}
