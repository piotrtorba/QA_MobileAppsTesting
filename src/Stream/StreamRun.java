package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamRun {
    public static void main(String[] args) {

        //Tworzenie Stream-ow roznego typu danych
        List<String> names = Arrays.asList("Tom", "David", "Matthew");
        Stream<String> streamNames = names.stream();
        Stream<Integer> streamInt= Arrays.asList(new Integer[]{1,2}).stream();
        DoubleStream doubleStream = DoubleStream.of(1,2,3,4,5);
        IntStream intStream = IntStream.range(1,40);

        //Przetwazanie daych ze streamow:
        //filter - filtrowanie
        //map - zmiana elementu na inny
        //limit - zwraca okreslona liczbe elementow
        //peek - pozwala przeprowadzic operacje na kazdym elemencie

        //Operacje zakonczenia Streamow:
        //forEach - wykonanie akcji dla kazdego z elementow streama
        //count - zwroci ilosc elementow strumienia
        //allMatch - sprawdza czy wszystkie elementy spelniaja warunek
        //collect - zwraca nowy typ na podstawie streama

        List<String> modifiedNames = streamNames.filter(el -> el.startsWith("T"))
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(modifiedNames.get(0));
        System.out.println(modifiedNames.size());

        long count = intStream.filter(el -> el > 20)
                .map(el -> el*2)
                .limit(11)
                .count();
        System.out.println(count);
    }
}
