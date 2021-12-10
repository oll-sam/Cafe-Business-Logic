import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCafe {

    public static void main(String[] args) {

        double[] prices = {4.5, 3.5, 5.5, 3.5, 9.5};
    
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");



        CafeUtil test_cafe = new CafeUtil();
        

        String testStreakGoal = test_cafe.getStreakGoal(1+2+3+4+5+6+7+8+9+10);
        String testOrderTotal = test_cafe.getOrderTotal(prices);
        String testMenuItems = test_cafe.getMenuItems(menu);
        // String testAddCustomer = test_cafe.getAddCustomer();
        


    System.out.println("\n-----Streak Test Goals-----");
    System.out.println(testStreakGoal);
    System.out.println("\n-----Order Total Test-----");
    System.out.println(testOrderTotal);
    System.out.println("\n-----Display Menu Test-----");
    System.out.println(testMenuItems);
    System.out.println("\n-----Add Customer Test-----");
    System.out.println("Please enter your name:");
    String userName = System.console().readLine();
        ArrayList<String> customer = new ArrayList<String>();
        customer.add(userName);
    System.out.println("Hello " + userName);
    test_cafe.getAddCustomer(customer);
    }
}
