package List;

public class Student {
    private String firstName;
    private String lastName;
    private String department;
    private int age;

    public Student(String firstName,String lastName,String department,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=department;
        this.age=age;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getDepartment(){
        return this.department;
    }

    public int getAge(){
        return this.age;
    }
}
