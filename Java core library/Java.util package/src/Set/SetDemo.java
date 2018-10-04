package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args){
        /*
        * Using HashSet
        */
        Set<Student>hashSet=new HashSet<>();

        hashSet.add(new Student(102,"Nguyen","A","Maththematic",20));
        hashSet.add(new Student(108,"Tran","Minh","Information technology",20));
        hashSet.add(new Student(155,"Truong","Thang","Information technology",20));
        hashSet.add(new Student(120,"Phan","Toan","Material Science",20));
        hashSet.add(new Student(114,"Le","Dung","Geography",20));

        System.out.println("_____________________________________");
        System.out.println("HashSet");
        System.out.println("_____________________________________");

        for(Student student:hashSet){
            System.out.println(student.getId()
                    +" "+student.getFirstName()
                    +" "+student.getLastName()
                    +" "+student.getDepartment()
                    +" "+student.getAge());
        }
        /*
        * Using LinkedHashSet
        */
        Set<Student>linkedHashSet=new LinkedHashSet<>();

        linkedHashSet.add(new Student(102,"Nguyen","A","Maththematic",20));
        linkedHashSet.add(new Student(108,"Tran","Minh","Information technology",20));
        linkedHashSet.add(new Student(155,"Truong","Thang","Information technology",20));
        linkedHashSet.add(new Student(120,"Phan","Toan","Material Science",20));
        linkedHashSet.add(new Student(114,"Le","Dung","Geography",20));

        System.out.println("_____________________________________");
        System.out.println("LinkedHashSet");
        System.out.println("_____________________________________");

        for(Student student:linkedHashSet){
            System.out.println(student.getId()
                    +" "+student.getFirstName()
                    +" "+student.getLastName()
                    +" "+student.getDepartment()
                    +" "+student.getAge());
        }
        /*
         * Using TreeSet
         */
        Set<Student>treeSet=new TreeSet<>();

        treeSet.add(new Student(102,"Nguyen","A","Maththematic",20));
        treeSet.add(new Student(108,"Tran","Minh","Information technology",20));
        treeSet.add(new Student(155,"Truong","Thang","Information technology",20));
        treeSet.add(new Student(120,"Phan","Toan","Material Science",20));
        treeSet.add(new Student(114,"Le","Dung","Geography",20));

        System.out.println("_____________________________________");
        System.out.println("TreeSet");
        System.out.println("_____________________________________");

        for(Student student:treeSet){
            System.out.println(student.getId()
                    +" "+student.getFirstName()
                    +" "+student.getLastName()
                    +" "+student.getDepartment()
                    +" "+student.getAge());
        }
    }
}
