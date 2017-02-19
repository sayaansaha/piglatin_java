import java.util.Scanner;

/**
 * This is what i am working on.
 */
public class HotDogBiz {
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);
        HotDogStand chidogs = new HotDogStand(1);
        HotDogStand midogs = new HotDogStand(2,1);
        HotDogStand nydogs = new HotDogStand(3);
        boolean moreChi = true;

        while(moreChi) {
            System.out.println("welcome to Chi Dogs, would you like a hot dog? ");
            String wouldLike = keys.next();
            if("yes".equalsIgnoreCase(wouldLike)){
                chidogs.justSold();
            }
            else break;
            System.out.println("would you like another dog?");
            String response = keys.next();
            if("yes".equalsIgnoreCase(response)){
                moreChi = true;
            }

            else {
                System.out.println("Thank you come again");
                moreChi = false;
            }

        }

        System.out.println("Would you like daily sales?");
        String salesRequest = keys.next();
        if ("yes".equalsIgnoreCase(salesRequest)){
            System.out.println("total number of hot dogs sold today were: " + chidogs.getTotalSales());
        }
        else {
            System.out.println("Have a great rest of your day");
            System.exit(0);
        }
    }
}
