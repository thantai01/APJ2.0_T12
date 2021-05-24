package Example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("CBR150All-new",1,"Aboard");
        Student st2 = new Student("CBR250RR",3,"Aboard");
        Student st3 = new Student("CBR500R",2,"Aboard");
        Student st4 = new Student("CBR650R",2,"Aboard");

        Map<Integer,Student> stMap = new HashMap<>();
        stMap.put(1,st1);
        stMap.put(2,st2);
        stMap.put(3,st3);
        stMap.put(4,st4);

        for (Map.Entry<Integer,Student> student : stMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("--------------------------");

        Set <Student> stSet = new HashSet<>();
        stSet.add(st1);
        stSet.add(st2);
        stSet.add(st3);
        stSet.add(st4);

        for(Student student: stSet) {
            System.out.println(student.toString());
        }
    }
}
