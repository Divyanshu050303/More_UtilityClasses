package dateAndTime;
import java.util.*;
public class date {
    // The Date class encapsulation the current data and time.
    public static void main(String[] args) {
       Date date=new Date();// Date class object
        System.out.println(date);// print the current date or time and Timezone
        // There are three way to compare the date
        // 1-> before()
        //2-> after()
        //3-> equals()
        Date date1 = new Date(2016, 11, 18);
        Date date2 = new Date(1997, 10, 27);
        boolean a = date2.after(date1);
        System.out.println("Is date2 is after date1 : " + a);
        boolean b = date2.before(date1);
        System.out.println("Is date2 is before date1 : " + b);

    }
}
