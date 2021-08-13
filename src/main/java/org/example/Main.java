package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Person> agePersons = new TreeSet<>(new PersonAgeComparator());

        agePersons.add(new Person("a", LocalDate.of(1990, 6, 16)));
        agePersons.add(new Person("c", LocalDate.of(1995, 7, 21)));
        agePersons.add(new Person("b", LocalDate.of(2005, 1, 2)));

        for (Person person : agePersons) {
            System.out.println(person.getName() + " "+ person.getAge());
        }

        System.out.println("---------------");

        TreeSet<Person> namePersons = new TreeSet<>(new PersonNameComparator());
        namePersons.addAll(agePersons);

        for (Person person : namePersons) {
            System.out.println(person.getName() + " "+ person.getAge());
        }

        System.out.println("----------------");

        HashMap<Person, List<Hobby>> personHobbies = new HashMap<>();

        Address address1 = new Address("Romania", "Cluj-Napoca", "Motilor");
        Address address2 = new Address("NotRomania :))", "Not Cluj-Napoca", "Not Motilor");
        Address address3 = new Address("Romania", "Brasov", "Independentei");

        ArrayList<Address> hobby1Locations = new ArrayList<>();
        hobby1Locations.add(address1);
        hobby1Locations.add(address2);
        Hobby hobby1 = new Hobby("Sah", 3, hobby1Locations);

        ArrayList<Address> hobby2Locations = new ArrayList<>();
        hobby2Locations.add(address3);
        Hobby hobby2 = new Hobby("Inot", 2, hobby2Locations);

        List<Hobby> hobbies = new ArrayList<>();
        hobbies.add(hobby1);
        hobbies.add(hobby2);

        Person person = agePersons.first();

        personHobbies.put(person, hobbies);

        for (Hobby hobby: personHobbies.get(person)) {
            for (Address address: hobby.getLocations()) {
                System.out.println(hobby.getName()+ " " + address.getCountry());
            }
        }
    }
}
