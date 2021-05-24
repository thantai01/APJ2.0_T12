package Demo1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = null;
        hashMap = new HashMap<>();
        hashMap.put("John",18);
        hashMap.put("Leon",19);
        hashMap.put("Diane",28);
        hashMap.put("Hypolypta",8);
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

    }
}
