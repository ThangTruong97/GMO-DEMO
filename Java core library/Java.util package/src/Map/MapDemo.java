package Map;

import List.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args){
        /*
        * Using HashMap
        */
        Map<Integer, Student>hashMap=new HashMap<>();

        hashMap.put(1,(new Student("Nguyen","A","Maththematic",20)));
        hashMap.put(3,(new Student("Tran","Minh","Information technology",20)));
        hashMap.put(5,(new Student("Truong","Thang","Information technology",20)));
        hashMap.put(2,(new Student("Phan","Toan","Material Science",20)));
        hashMap.put(4,(new Student("Le","Dung","Geography",20)));

        System.out.println("___________________________________");
        System.out.println("HashMap");
        System.out.println("___________________________________");

        for(Map.Entry<Integer,Student>entry:hashMap.entrySet()){
            int key=entry.getKey();
            Student value=entry.getValue();
            System.out.println("Key: "+key);
            System.out.println("Value: "+value.getFirstName()+" "+value.getLastName()
                    +" "+value.getDepartment()
                    +" "+value.getAge());
        }
        /*
        * Using LinkedHashMap
        */
        Map<Integer, Student>linkedHashMap=new LinkedHashMap<>();

        linkedHashMap.put(1,(new Student("Nguyen","A","Maththematic",20)));
        linkedHashMap.put(3,(new Student("Tran","Minh","Information technology",20)));
        linkedHashMap.put(5,(new Student("Truong","Thang","Information technology",20)));
        linkedHashMap.put(2,(new Student("Phan","Toan","Material Science",20)));
        linkedHashMap.put(4,(new Student("Le","Dung","Geography",20)));
        System.out.println("___________________________________");
        System.out.println("LinkedHashMap");
        System.out.println("___________________________________");
        for(Map.Entry<Integer,Student>entry:linkedHashMap.entrySet()){
            int key=entry.getKey();
            Student value=entry.getValue();
            System.out.println("Key: "+key);
            System.out.println("Value: "+value.getFirstName()+" "+value.getLastName()
                    +" "+value.getDepartment()
                    +" "+value.getAge());
        }

        /*
         * Using TreeMap
         */
        Map<Integer, Student>treeMap=new TreeMap<>();

        treeMap.put(1,(new Student("Nguyen","A","Maththematic",20)));
        treeMap.put(3,(new Student("Tran","Minh","Information technology",20)));
        treeMap.put(5,(new Student("Truong","Thang","Information technology",20)));
        treeMap.put(2,(new Student("Phan","Toan","Material Science",20)));
        treeMap.put(4,(new Student("Le","Dung","Geography",20)));
        System.out.println("___________________________________");
        System.out.println("TreeMap");
        System.out.println("___________________________________");
        for(Map.Entry<Integer,Student>entry:treeMap.entrySet()){
            int key=entry.getKey();
            Student value=entry.getValue();
            System.out.println("Key: "+key);
            System.out.println("Value: "+value.getFirstName()+" "+value.getLastName()
                    +" "+value.getDepartment()
                    +" "+value.getAge());
        }

    }
}
