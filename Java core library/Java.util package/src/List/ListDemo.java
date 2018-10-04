package List;

import java.util.*;

public class ListDemo {
    public static void main(String[] args){
        /*
         * Using ArrayList
         */
        ArrayList<Student> list1=new ArrayList<>();
        //Add new student to list
        list1.add(new Student("Nguyen","A","Maththematic",20));
        list1.add(new Student("Tran","Minh","Information technology",20));
        list1.add(new Student("Truong","Thang","Information technology",20));
        list1.add(new Student("Phan","Toan","Material Science",20));
        list1.add(new Student("Le","Dung","Geography",20));

        System.out.println("____________________________________________");
        System.out.println("ArrayList");
        System.out.println("____________________________________________");

        System.out.println("The elements of the list: ");
        //Using iterator to loop thought element of the list
        Iterator<Student> iterator1=list1.iterator();
        //Print out information of each element in list
        Student currentStudent;
        while (iterator1.hasNext()){
            currentStudent=iterator1.next();
            System.out.print("\nFirst name: "+currentStudent.getFirstName()
                    +"\nLast name: "+currentStudent.getLastName()
                    +"\nDepartment: "+currentStudent.getDepartment()
                    +"\nAge: "+currentStudent.getAge()
                    +"\n----------------------------------------");
        }
        //Remove the element at position 1 and 3
        list1.remove(1);
        list1.remove(3);
        //Print out information of each element after remove some element
        System.out.println("\nThe elements of the list after remove some element: ");
        iterator1=list1.iterator();
        while (iterator1.hasNext()){
            currentStudent=iterator1.next();
            System.out.print("\nFirst name: "+currentStudent.getFirstName()
                    +"\nLast name: "+currentStudent.getLastName()
                    +"\nDepartment: "+currentStudent.getDepartment()
                    +"\nAge: "+currentStudent.getAge()
                    +"\n----------------------------------------");
        }

        /*
        * Using LinkedList
        */
        LinkedList<Student> list2=new LinkedList<>();
        //Add new student to list
        list2.add(new Student("Nguyen","A","Maththematic",20));
        list2.add(new Student("Tran","Minh","Information technology",20));
        list2.add(new Student("Truong","Thang","Information technology",20));
        list2.add(new Student("Phan","Toan","Material Science",20));
        list2.add(new Student("Le","Dung","Geography",20));
        //Using addFirst() and addLast() of LinkedList class to add element at the first position and the last position
        list2.addFirst(new Student("Cao","Sang","Physics",22));
        list2.addLast(new Student("Nguyen","Ha","Biology",21));

        System.out.println("\n____________________________________________");
        System.out.println("LinkedList");
        System.out.println("____________________________________________");

        System.out.println("\nThe elements of the list : ");
        Iterator<Student>iterator2=list2.iterator();
        Student currentStudentLinkedList;
        while (iterator2.hasNext()){
            currentStudentLinkedList=iterator2.next();
            System.out.print("\nFirst name: "+currentStudentLinkedList.getFirstName()
                    +"\nLast name: "+currentStudentLinkedList.getLastName()
                    +"\nDepartment: "+currentStudentLinkedList.getDepartment()
                    +"\nAge: "+currentStudentLinkedList.getAge()
                    +"\n----------------------------------------");
        }
        //Using removeFirst() and removeLast() of LinkedList class to remove element at the first and the last position
        list2.removeFirst();
        list2.removeFirst();
        list2.removeLast();
        list2.removeLast();

        System.out.println("\nThe elements of the list after modify: ");
        iterator2=list2.iterator();
        while (iterator2.hasNext()){
            currentStudentLinkedList=iterator2.next();
            System.out.print("\nFirst name: "+currentStudentLinkedList.getFirstName()
                    +"\nLast name: "+currentStudentLinkedList.getLastName()
                    +"\nDepartment: "+currentStudentLinkedList.getDepartment()
                    +"\nAge: "+currentStudentLinkedList.getAge()
                    +"\n----------------------------------------");
        }

        /*
        * Using Vector
        */
        Vector<Student> list3=new Vector<>();
        //Add element into Vector using addElement()
        //This can;t be done with ArrayList and LinkedList (using add() instead)
        list3.addElement(new Student("Nguyen","A","Maththematic",20));
        list3.addElement(new Student("Tran","Minh","Information technology",20));
        list3.addElement(new Student("Truong","Thang","Information technology",20));
        list3.addElement(new Student("Phan","Toan","Material Science",20));
        list3.addElement(new Student("Le","Dung","Geography",20));
        //Using enumeration to loop thought element of the Vector
        //This can't be done with ArrayList and LinkedList
        Enumeration<Student> enumeration=list3.elements();

        System.out.println("\n____________________________________________");
        System.out.println("Vector");
        System.out.println("____________________________________________");

        System.out.println("\nThe elements of the list : ");
        Student currentStudentVector;
        while(enumeration.hasMoreElements()){
            currentStudentVector=enumeration.nextElement();
            System.out.print("\nFirst name: "+currentStudentVector.getFirstName()
                    +"\nLast name: "+currentStudentVector.getLastName()
                    +"\nDepartment: "+currentStudentVector.getDepartment()
                    +"\nAge: "+currentStudentVector.getAge()
                    +"\n----------------------------------------");
        }

    }
}
