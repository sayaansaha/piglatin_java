import java.util.Scanner;

/**
 * A program that takes as input the gender of the child, the height of the mother in inches,
 * and the height of the father in inches, and outputs the estimated adult height of the child in inches
 */
public class heightGuesser {
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);

        // intialize variables needed
        int fatherHeight, motherHeight, maleKidHeight, femaleKidHeight;


        System.out.println("What is the sex of your child? please enter male or female");

        // reads sex and assigns boolean

        String sex = keys.next();

        System.out.println("What is the fathers height in inches?");
        fatherHeight = keys.nextInt();

        System.out.println("What is the mothers height in inches?");
        motherHeight = keys.nextInt();

        if ("male".equalsIgnoreCase(sex)){
            maleKidHeight = ((motherHeight * (13/12)) + fatherHeight)/2;
            System.out.println("Your male child's projected height is: " + maleKidHeight);
        }
        else {
            femaleKidHeight = ((fatherHeight * (12/13)) + motherHeight)/2;
            System.out.println("Your female child's projected height is: " + femaleKidHeight);
        }


    }
}
