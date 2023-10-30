package Minimum;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<Human> set = new LinkedHashSet<>(); // Замість TreeSet використовуємо LinkedHashSet
        set.add(new Human("Іван", 23));
        set.add(new Human("Наталка", 15));
        set.add(new Human("Дмитро", 55));
        set.add(new Human("Максим", 5));

        System.out.println("Невідсортований:");
        for (Human human: set){
            System.out.println(human);
        }

        Set<Human> sortedSet = new TreeSet<>(new ComparatorAge());
        sortedSet.addAll(set);

        System.out.println("Відсортований:");
        for (Human human: sortedSet){
            System.out.println(human);
        }


    }
}