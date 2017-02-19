import java.util.Scanner;

/**
 * A simple invoice calcualtion program.
 */
public class Bills {
    private int hours;
    private  int minutes;
    private double fee;

    public static double RATE = 1.5;

    public void inputTimeWorked(){
        Scanner keys =  new Scanner(System.in);
        System.out.println("Please enter the number of hours worked");
        hours = keys.nextInt();

        System.out.println("please enter number of minutes");
        minutes = keys.nextInt();

    }

    private double computeFee(int hours, int minutesWorked){
        minutesWorked = (hours * 60) + minutesWorked;
        return (minutesWorked * RATE);
    }

    public void updateFee(){
        fee = computeFee(hours, minutes);
    }

     public void outputBill(){
        System.out.println("Your calculated rate is " + fee);
        System.out.println("Based on " + hours + " hours and " + minutes + " minutes worked.");
    }
}
