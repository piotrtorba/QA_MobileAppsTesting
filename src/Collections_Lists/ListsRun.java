package Collections_Lists;

import Lambda.ITstudent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsRun {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); //Utworzenie listy
        names.add("Jojo");
        names.add("Kasia");
        names.add("Ola");
        names.add("Kasia");

        System.out.println(names.get(0));
        System.out.println(names.indexOf("Kasia"));
        System.out.println(names.lastIndexOf("Kasia"));
        System.out.println(names.contains("Jojo"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());

        System.out.println("-------------------------------");

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.get(0));
        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.lastIndexOf(4));
        System.out.println(numbers.contains(1));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());

        System.out.println("-------------------------------");

        List<String> anotherNames = new ArrayList<>();
        anotherNames.addAll(names); //Dodanie wszystkich elemento innej kolekcji

        System.out.println("-------------------------------");

        List<ITstudent> studentIT = new ArrayList<>(); //Dodanie do listy obiektu innej klasy
        studentIT.add(new ITstudent());

        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("---------------- for : ---------------");
        for (String name : names) {
            System.out.println(name);
        }

        /*List<String> words = new ArrayList<>(Arrays.asList("Hello", "World", "this", "is", "Java!"));
        System.out.println(words.get(0)+" "+words.get(1)+" "+words.get(2)+" "+words.get(3)+" "+words.get(words.size()-1));*/


    }
}
