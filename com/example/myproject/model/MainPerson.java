package com.example.myproject.model;


public class MainPerson {

    public static void main(String[] args) {
        FamilyTree<FamilyMember> familyTree = new FamilyTree<>();

        Person person1 = new Person("John", "Male", "01-01-1980", "N/A");
        Person person2 = new Person("Amy", "Female", "05-03-1985", "N/A");
        Person person3 = new Person("David", "Male", "10-07-1990", "N/A");
        Person person4 = new Person("Emily", "Female", "15-09-1995", "N/A");

        person3.addParent(person1);
        person3.addParent(person2);
        person4.addParent(person1);
        person4.addParent(person2);
        person1.addChild(person3);
        person1.addChild(person4);
        person2.addChild(person3);
        person2.addChild(person4);

        familyTree.addPerson(person1);
        familyTree.addPerson(person2);
        familyTree.addPerson(person3);
        familyTree.addPerson(person4);

        System.out.println("Дети выбранного человека:");
        for (Person child : person1.getChildren()) {
            System.out.println(child);
        }

        System.out.println("Родители выбранного человека:");
        for (Person parent : person3.getParents()) {
            System.out.println(parent);
        }

        familyTree.sortByName();
        System.out.println("Отсортированный список людей по имени:");
        for (FamilyMember person : familyTree) {
            System.out.println(person);
        }

        familyTree.sortByBirthDate();
        System.out.println("Отсортированный список людей по дате рождения:");
        for (FamilyMember person : familyTree) {
            System.out.println(person);
        }
    }
}