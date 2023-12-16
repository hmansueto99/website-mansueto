import java.util.Scanner;
public class Eggs
{
   public static void main(String[] args)
   {
   double eggIndividual= .45;
   double eggDozen = 3.25;
   int eggs;
   int dozen = 12;
   int eggdo;
   int eggind;
   double totalPrice;
   
   Scanner inputDevice = new Scanner(System.in);
   System.out.print("Enter the no. of Eggs: ");
   eggs = inputDevice.nextInt();
   eggdo = eggs / dozen;
   eggind = eggs - (eggdo*12);
   totalPrice = eggdo * eggDozen + eggind * eggIndividual;
   System.out.println("You ordered "+eggs+" eggs. That's " +eggdo+" dozen at $" +eggDozen+ " per dozen and " +eggind+ " loose eggs at 45 cents each for a total of $" +String.format ("%.2f",totalPrice));

   }
}