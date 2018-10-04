package Iterator;

import List.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Student> list1 = new ArrayList<>();
        //Add new student to list
        list1.add(new Student("Nguyen", "A", "Maththematic", 20));
        list1.add(new Student("Tran", "Minh", "Information technology", 20));
        list1.add(new Student("Truong", "Thang", "Information technology", 20));
        list1.add(new Student("Phan", "Toan", "Material Science", 20));
        list1.add(new Student("Le", "Dung", "Geography", 20));

        System.out.println("____________________________________________");
        System.out.println("ArrayList");
        System.out.println("____________________________________________");

        System.out.println("The elements of the list: ");
        //Using iterator to loop thought element of the list
        Iterator<Student> iterator1 = list1.iterator();
        //Print out information of each element in list
        Student currentStudent;
        while (iterator1.hasNext()) {
            currentStudent = iterator1.next();
            System.out.print("\nFirst name: " + currentStudent.getFirstName()
                    + "\nLast name: " + currentStudent.getLastName()
                    + "\nDepartment: " + currentStudent.getDepartment()
                    + "\nAge: " + currentStudent.getAge()
                    + "\n----------------------------------------");
        }
    }
}
