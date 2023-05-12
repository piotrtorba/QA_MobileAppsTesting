package Java_Course.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapsRun {
    public static void main(String[] args) {
        /* W mapach istnieje struktura typu key:value, gdzie klucz musi byc unikalny,ale wartosci moga sie powtarzac.
            Dodajac kolejny element z takim samym kluczem, poprzedni wpis zostanie nadpisany.*/

        Map<Integer, String> students = new HashMap<>(); // W tym przypadku String jest kluczem, a Integer wartoscia
        students.put(1, "Basia");
        students.put(2, "Tomek");
        students.put(3, "Basia");

        System.out.println(students.get(1));
        System.out.println("--------------------");


        Map<Integer, String> otherStudents = new HashMap<>();
        otherStudents.putAll(students);

        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Jadzia"));
        System.out.println("--------------------");
        System.out.println(students.isEmpty()); //Czy jest pusta
        System.out.println(students.size()); //Rozmiar mapy

        students.remove(3); //Usowanie elementow
        System.out.println(students);

        System.out.println("----------------- for 'keys/values' ---------------------");

        for (Integer key : students.keySet()) {
            System.out.println(key); //wypisanie klucza
            System.out.println(students.get(key)); //Wypisanie wartosci
        }
        System.out.println("----------------- for 'values' ---------------------");
        for (String value : students.values()) {
            System.out.println(value);
        }
    }
}
