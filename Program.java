//import stuff here
import java.util.Scanner;
//Your code here
public class dmcalc{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many Schrute Bucks did you have?");
        String sb = myObj.nextLine();
        System.out.println("Schrute Bucks = "+ sb);
        System.out.println("How many Klevins did you have?");
        String k = myObj.nextLine();
        System.out.println("Klevins = "+ k);
        System.out.println("How many Stanley Nickles did you have?");
        String sn = myObj.nextLine();
        System.out.println("Stanley Nickles = "+ sn);
        
        double stan = Double.valueOf(sn);       
        double kev = Double.valueOf(k);
        double schr = Double.valueOf(sb);
        
        
        double total = schr + (double) kev /20 + (double) stan /240;
        total = (double) Math.round(total * 100) /100;
        
        System.out.format("Your new balance is: $" + "%.2f", total);
        
    }
}
//Paste console output below:
/*
How many Schrute Bucks did you have?
7
Schrute Bucks = 7
How many Klevins did you have?
17
Klevins = 17
How many Stanley Nickles did you have?
9
Stanley Nickles = 9
Your new balance is: $7.89

*/
