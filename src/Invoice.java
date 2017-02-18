/**
 * Created by Admin on 2/18/17.
 */
public class Invoice {
    public static void main(String[] args){
        System.out.println("Welcome to the law offices of");
        System.out.println("Dewey, Cheatham, and Howe.");
        Bills yourbill = new Bills();
        yourbill.inputTimeWorked();
        yourbill.outputBill();
        System.out.println("We have placed a lien on your house.");
        System.out.println("It has been our pleasure to serve you.");
    }
}
