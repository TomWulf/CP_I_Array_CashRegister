import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
       final int MAX_ITEMS = 100;
	   int recCount = 0;

       double[] items = new double[MAX_ITEMS];
       double total = 0;
       double ave = 0;
       double price = 0;

       boolean done = false;
       String anotherYN = "";

       Scanner console = new Scanner(System.in);


       do
       {

           // Use SafeInput to collect the item price
           price = SafeInput.getRangedDouble(console, "Enter the item Price", .01, 1000.0);
           // add it to the total
           total += price;
           items[recCount] = price;
           recCount++;

           done = SafeInput.getYNConfirm(console, "Are you done");

       }while(!done);

       // Now code to display the list of item prices and the total in a table using printf formatting

    }
}
