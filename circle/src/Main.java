import hsa.Console;
import java.util.Scanner;

public class Main
{

 public static void main (String[] args)
 {
     surfaceArea ();
     // Place your program here.  'c' is the output console
 } // main method


 public static void surfaceArea ()
 {
 Scanner sc = new Scanner(System.in);
 Console c = new Console();
 c.print("test");
     double r = sc.nextDouble ();
     double h = sc.nextDouble ();
     double SA = 2 * Math.PI * r * h + 2 * Math.PI * Math.pow(r,2);
     System.out.println(SA);
    // SA = Math.round(SA*100);
    // SA = SA/100;
    // System.out.println(SA);
     System.out.println((double)(Math.round(SA*100))/100);
     sc.close();
 }
}
