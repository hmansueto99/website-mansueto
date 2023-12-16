import java.util.Scanner;
class TelephoneCall
{
public static void main(String[] args)
{
   String telephoneNumber;
   Scanner inputDevice = new Scanner(System.in);
   
   System.out.println("Enter telephone number: ");
   telephoneNumber = inputDevice.nextLine();
   telephoneNumber.substring(0,7) ;
   
   System.out.println(telephoneNumber.substring(0,7));
   
   System.out.println(telephoneNumber.substring(0,3) + " - " +
   telephoneNumber.substring(3,7));
   
   if(Integer.parseInt(telephoneNumber.substring(0,3)) == 225){
   System.out.println("Call-Home");
   }else{
   System.out.println("Get LOAN");
   }
}
}