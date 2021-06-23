package com.zzc.design.structure.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<FilterPerson> persons = new ArrayList<>();

        persons.add(new FilterPerson("Robert","Male", "Single"));
        persons.add(new FilterPerson("John","Male", "Married"));
        persons.add(new FilterPerson("Laura","Female", "Married"));
        persons.add(new FilterPerson("Diana","Female", "Single"));
        persons.add(new FilterPerson("Mike","Male", "Single"));
        persons.add(new FilterPerson("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<FilterPerson> persons){
        for (FilterPerson person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
