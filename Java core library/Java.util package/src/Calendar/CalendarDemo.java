package Calendar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args){
        Calendar calendar=Calendar.getInstance();
        System.out.println("The current date is: "+calendar.getTime());
        calendar.add(Calendar.DATE,-1);
        System.out.println("Yesterday: "+calendar.getTime());
        calendar.add(Calendar.MONTH,-2);
        System.out.println("2 month ago: "+calendar.getTime());
        calendar.add(Calendar.YEAR,1);
        System.out.println("1 year later: "+calendar.getTime());

        int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in week: " + maximum);
        maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum number of weeks in year: " + maximum);

        int minimum = calendar.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum number of days in week: " + minimum);
        minimum = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Minimum number of weeks in year: " + minimum);
    }
}
