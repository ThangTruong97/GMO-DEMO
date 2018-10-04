package Date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args){
        Date currentDate=new Date();
        Date date1=new Date(2018,8,28);
        Date date2=new Date(2018,11,25);

        System.out.println("Current date is: "+currentDate);

        boolean a= date2.after(date1);
        System.out.println("date2 come after d1: "+a);

        boolean b= date2.before(currentDate);
        System.out.println("date2 come before current date: "+b);


        System.out.println("Milisecond from Jan 1 1970 to current date is: "+currentDate.getTime());

    }
}
