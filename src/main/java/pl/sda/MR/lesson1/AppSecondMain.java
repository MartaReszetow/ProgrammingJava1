package pl.sda.MR.lesson1;

import java.time.LocalDate;
import java.util.*;

public class AppSecondMain {

    public static void main(String[] args) {

        Person marta = new Person("Marta", "AAAAA", "111", LocalDate.of(1900, 12, 23));
        Person ania = new Person("Ania", "BBBB", "222", LocalDate.of(1950, 12, 23));
        Person zenon = new Person("Zenon", "CCCCC", "333", LocalDate.of(1960, 12, 23));
        Person zenon2 = new Person("Zenon", "CCCCC", "333", LocalDate.of(1960, 12, 23));
        Person asienka = new Person("Asia", "DDDDD", "444", LocalDate.of(1960, 12, 23));


        System.out.println("___________________LISTA______________");
        List<Person> personList = new ArrayList<>();
        personList.add(marta);
        personList.add(ania);
        personList.add(zenon);
        personList.add(zenon2);
        personList.add(asienka);

        for (Person singlePerson : personList
        ) {
            System.out.println(singlePerson);
        }


        System.out.println("___________________STOS______________");
        Set<Person> personSet = new HashSet<>();
        personSet.add(marta);
        personSet.add(ania);
        personSet.add(zenon);
        personSet.add(zenon2);
        personSet.add(asienka);

        for (Person singlePerson : personSet
        ) {
            System.out.println(singlePerson);
        }


        Map<String, Person> personMap = new HashMap<>();
        System.out.println("___________________MAPA______________");
            personMap.put(marta.getPeselNumber(), marta);
            personMap.put(ania.getPeselNumber(), ania);
            personMap.put(zenon.getPeselNumber(), zenon);
            personMap.put(zenon2.getPeselNumber(), zenon2);
            personMap.put(asienka.getPeselNumber(), asienka);

            for (String key: personMap.keySet()
                 ) {
                System.out.println(personMap.get(key));
            }



        }


    }




