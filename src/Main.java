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

           // Prevent an overload of input
           if(recCount == 99)
           {
               System.out.println("Out of Memory, reached the max num of records!");
               System.out.println("Don\'t you have a life!?");
               done = true;
           }
           else
           {
               done = SafeInput.getYNConfirm(console, "Are you done");
           }
       }while(!done);

       ave = total / recCount;

       // Now code to display the list of item prices and the total in a table using printf formatting

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("****                      Shopping Recept                               ***");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for(int r = 0; r < recCount; r++)
        {
            System.out.printf("   Item:%3d%63.2f\n",r+1, items[r]);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("   Total: %65.2f\n", total);
        System.out.printf("   Ave: %67.2f", ave);

    }
}
