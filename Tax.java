import java.util.*;

public class Tax
{
 public static void main(String[] args)
  {
   float income;
   float  tax;
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter your Income");
   income=sc.nextFloat();

    if(income<250000)
     {
      System.out.println("Congratulations you not need to pay any of your penny to government, the whole is your's.");
      
     }
    

       if((income>=500001) && (income<=1000000))
       {
         System.out.println("You will need to pay 20% " + ((((income-500000)*20)/100)+12500) + " as income tax"); 
       }

       if(income>1000000)
       {
         System.out.println("You will need to pay 30% "+ ((((income-1000000)*30)/100)+112500) + " as income tax"); 
       }

       else
       {
         System.out.println("Invalid Input");
       }
  }
}