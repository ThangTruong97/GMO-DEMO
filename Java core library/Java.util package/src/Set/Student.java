package Set;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private String department;
    private int age;
    private int id;

    public Student(int id,String firstName,String lastName,String department,int age){
        this.id=id;
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

    public int getId(){
        return this.id;
    }
    @Override
    public int compareTo(Student o) {
        if(id>o.id){
            return 1;
        }else if(id<o.id){
            return -1;
        }else{
            return 0;
        }
    }
}
