import java.util.Scanner;

/**
 * Created by Admin on 2/18/17. The first attempt was the least useful
 */
public class pigLatin {
    public static void main(String[] arg) {
        Scanner keys = new Scanner(System.in);

        System.out.println("Please enter your full name ");
        String firstName = keys.next().toLowerCase();
        String lastName = keys.next().toLowerCase();

        String first = firstName.substring(0,1);
        String latinf = firstName.substring(1,firstName.length());
        String pig1 = latinf + first;

        String second = lastName.substring(0,1);
        String latinp = lastName.substring(1, lastName.length());
        String pig2 = latinp + second;



        System.out.println("In Pig latin your name is:  " + pig1 + " " + pig2);
    }
}
