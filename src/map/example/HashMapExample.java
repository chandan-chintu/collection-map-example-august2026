package map.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>();

        // add data
        map1.put(107,"Guava");
        map1.put(110,"Mango");
        map1.put(102,"Pineapple");
        map1.put(105,"Orange");
        map1.put(101,"Apple");
        map1.put(null,"Grapes");
        map1.put(106,"Mango");
        map1.put(106,"Banana");// old value for key 106 will be removed and new value will be added

        System.out.println("map1 is : "+map1);

        map1.remove(null);
        System.out.println("map1 after removing null key is : "+map1);

        System.out.println("traverse map using foreach");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey()+"---"+m1.getValue());
        }
    }
}
