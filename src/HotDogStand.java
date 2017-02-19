/**
 * Created by Admin on 2/19/17.
 */
public class HotDogStand {
    private int standID;
    private int unitSold;
    public static int totalSales = 0;

    public HotDogStand(int ID, int sold ){
        standID = ID;
        unitSold = sold;
    }

    public HotDogStand(int ID){
        standID = ID;
        unitSold = 0;
    }

    public void justSold(){
        unitSold = unitSold + 1;
        totalSales = totalSales +1;
    }

    public int standSales(){
        return unitSold;
    }

    public static int getTotalSales(){
        return totalSales;
    }

}
