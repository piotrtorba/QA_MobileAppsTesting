package Java_Course.Collections_Sets;

import java.util.HashSet;
import java.util.Set;

public class SetsRun {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("orange");

        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        Set<String> vege = new HashSet<>();
        vege.add("potatoes");
        vege.add("onion");
        vege.addAll(fruits);

        System.out.println(vege.size());

        for (String fruit : fruits) {  //Poniewaz 'Set-y' nie zwieraja indexow i nie moga zawierac duplikatow
                                        //nalezy wypisywac je uzywajac uproszczonej petli 'for'
            System.out.println(fruit);
        }
    }
}
