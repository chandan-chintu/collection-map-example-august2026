package collection.example.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set<Integer> set1 = new LinkedHashSet<>();

        set1.add(56);
        set1.add(77);
        set1.add(null);
        set1.add(12);
        set1.add(-90);
        set1.add(33);
        set1.add(-3);
        set1.add(77);

        System.out.println("set1 is is : "+set1);

        set1.remove(56);
        System.out.println("set1 after removing data : "+set1);

        System.out.println("traverse set1 using foreach loop");
        for (Integer s1 : set1){
            System.out.println(s1);
        }
    }
}
