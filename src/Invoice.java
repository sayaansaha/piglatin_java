import java.util.Scanner;

/**
 * Created by Admin on 2/18/17.
 */
public class Invoice {
    static boolean tryAgain = true;
    public static void main(String[] args) {

        // repeats the process as long as user enters yes
        while (tryAgain) {
            Scanner keys =  new Scanner(System.in);
            System.out.println("Welcome to the law offices of");
            System.out.println("Dewey, Cheatham, and Howe.");
            Bills yourbill = new Bills();
            yourbill.inputTimeWorked();
            yourbill.outputBill();
            System.out.println("We have placed a lien on your house.");
            System.out.println("It has been our pleasure to serve you, try again?");
            String yesNo = keys.next();
            if ("no".equalsIgnoreCase(yesNo)) {
                tryAgain = false;
            }

        }

    }
}
