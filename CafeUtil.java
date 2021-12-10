import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  CafeUtil{
    
    public String getStreakGoal(int numWeeks){
        return "Purchases needed by week to: " + numWeeks;
    }

    public String getOrderTotal(double[] prices){
        int sum = 0;
        double dsum = sum;
        for(int i =0; i < prices.length; i++){
        dsum = dsum + prices[i];
        }
        return "Order Total is: " + dsum;
    }

    public String getMenuItems(ArrayList<String> menu){
        String items = "";
        for(int i =0; i < menu.size(); i++){
            items += menu.get(i) + " " ;
        }
    return items;
    }

    public void getAddCustomer(ArrayList<String> customer){
        for(int i= 0; i < customer.size(); i++){
            System.out.println(customer.get(i));
        }
    }
}