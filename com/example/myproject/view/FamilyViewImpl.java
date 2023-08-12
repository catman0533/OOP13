package com.example.myproject.view;

import java.util.List;
import java.util.Scanner;
import com.example.myproject.model.Person;
import com.example.myproject.model.FamilyTree;
import com.example.myproject.presenter.FamilyPresenter;
import com.example.myproject.presenter.FamilyPresenterImpl;
// import com.example.myproject.view.FamilyView;



public class FamilyViewImpl implements FamilyView {
    private FamilyPresenter presenter;
    private Scanner scanner;

    public FamilyViewImpl() {
        FamilyTree<Person> model = new FamilyTree<>();
        presenter = new FamilyPresenterImpl(this, model);
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("1. Add Family Member");
            System.out.println("2. Display Family Tree");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter family member name: ");
                    String name = scanner.next();
                    presenter.addFamilyMember(name);
                    break;
                case 2:
                    presenter.displayFamilyMembers();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    @Override
    public void displayFamilyTree(List<Person> familyMembers) {
        if (familyMembers.isEmpty()) {
            System.out.println("Family tree is empty.");
        } else {
            System.out.println("Family Tree:");
            for (Person person : familyMembers) {
                System.out.println(person.getName());
            }
        }
    }

    @Override
    public void displayErrorMessage(String errorMessage) {
        System.out.println("Error: " + errorMessage);
    }

//     @Override
//     public void displayFamilyMembers(List<Person> familyMembers) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'displayFamilyMembers'");
//     }
// }
          @Override
     public void displayFamilyMembers(List<Person> familyMembers) {
          if (familyMembers.isEmpty()) {
             System.out.println("There are no family members.");
         } else {
        System.out.println("Family Members:");
        for (Person person : familyMembers) {
            System.out.println(person.getName());
        }
    }
     }
    }
