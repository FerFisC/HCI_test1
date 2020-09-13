import java.util.Scanner;
 public class ArrayPrinter {
  public static void main (String [] args) {
   Scanner scnr = new Scanner (System.in);
   final int NUM_ELEMENTS = 8;
   int [] userVals = new int [NUM_ELEMENTS];
   int i;

   System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
   for(i = 0; i < 8; ++i) { //error when userVals.lengTH
     System.out.println("Value: ");
     userVals[i] = scnr.nextInt();
   }
   System.out.println("You entered: ");
   for(i = 0; i < 8; ++i) {
     System.out.print(userVals[i] + " ");
   }




  }
 }
