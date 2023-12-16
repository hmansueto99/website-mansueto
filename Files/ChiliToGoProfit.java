import java.util.Scanner;

class ChiliToGoProfit
{

   public static void main(String args [])
   {
   
   final int adultMeal = 7;
   final int childsMeal = 4;
   final double adultCost= 4.35;
   final double childCost= 3.10;
   double adultProfit;
   double childProfit;
   double totalProfit;
   int numAdultMeal;
   int numChildsMeal;
   int totalAdultMeal;
   int totalChildsMeal;
   int totalAllMeal;
   
   Scanner input = new Scanner (System.in);
   System.out.print("Enter number of adult meal:  ");
   numAdultMeal = input.nextInt();
   
   System.out.print("Enter number of child's meal:  ");
   numChildsMeal = input.nextInt();
   
   System.out.println("Adult Meal =  " + numAdultMeal);
   System.out.println("Childs Meal =  " + numChildsMeal);
   
   totalAdultMeal = adultMeal * numAdultMeal;
   totalChildsMeal = childsMeal * numChildsMeal;
   totalAllMeal = totalAdultMeal + totalChildsMeal;
   
   System.out.println("Total Adult's Meal Price = $ " + totalAdultMeal);
   System.out.println("Total Child's Meal Price = $ " + totalChildsMeal);
   System.out.println("Total All Meal Price = $ " + totalAllMeal);
   
   //profit
   adultProfit = totalAdultMeal - (adultCost * numAdultMeal);
   childProfit = totalChildsMeal - (childCost * numChildsMeal);
   totalProfit = adultProfit + childProfit;
   
   
   System.out.println(String.format ("Total Adult Meal Profit : $ %.2f",adultProfit) );
   System.out.println(String.format ("Total Child Meal Profit : $ %.2f",childProfit) );
   System.out.println(String.format ("Total All Meal Profit : $ %.2f",totalProfit) );
   
   
   
   
   
   
      
   
   
   }
 }