package dateAndTime;
import java.util.Calendar;
public class calendarDemo {
    // The abstract Calendar clas provides a set of methods that allows you to convert a time in milliseconds to number
    // of useful component
    public static void main(String[] args) {
        String []months={
                "Jan", "Feb","Mar", "Apr",
                "May", "Jun" ,"Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"
        };
        //Create a calendar initialized with the current date and time in the default locale and timezone
        Calendar cla=Calendar.getInstance();
        //Display current time and date information
        System.out.print("Date: ");
        System.out.print(months[cla.get(Calendar.MONTH)]);
        System.out.print(" "+cla.get(Calendar.DATE)+" ");
        System.out.println(cla.get(Calendar.YEAR));

        System.out.print("Time :");
        System.out.print(cla.get(Calendar.HOUR)+":");
        System.out.print(cla.get(Calendar.MINUTE)+":");
        System.out.println(cla.get(Calendar.SECOND));
        // Set the time and date information ad display it.
        cla.set(Calendar.HOUR, 10);
        cla.set(Calendar.MINUTE, 28);
        cla.set(Calendar.SECOND, 23);
        System.out.println("Updated Time :");

        System.out.print(cla.get(Calendar.HOUR)+":");
        System.out.print(cla.get(Calendar.MINUTE)+":");
        System.out.println(cla.get(Calendar.SECOND));
    }
}
