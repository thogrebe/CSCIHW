package HW3;
import java.util.Scanner;
public class Loops {

   //NOTE: DO NOT change anything in the boiler plate
   //If I added default code it is meant to be there
   //and should not be adjusted unless otherwise noted
   //(return statments are usually changed)
   //Make a method that will return true if a given
   //String contains between 1 and 3 'e' chars.
   //Ex.
   //loopE("eat") -> true
   //eeat -> true
   //eeeat -> true
   //eeeeat -> false
   public static boolean loopE(String str){
       int count=0;
       for(int i=0 ; i<str.length() ; i++) // for loop iterates over string
       {
           if (str.charAt(i) == 'e') // checks if ith characte is equal to e then increment count of e by 1
           {
               ++count;              
           }
       }
       if (count >= 1 && count <= 3) // checks if count lies between 1 and 3 then returns true
       {
           return true;
       }
       else // if count does not lies between 1 and 3
       return false; // <- this should be changed
   }
  
   //Given a String str and int n return a larger string
   //that is n copies of the original string
   //Ex.
   //stringTimes("Code",2) ->"CodeCode"
   //stringTimes("Code",4) ->"CodeCodeCodeCode"
   public static String stringTimes(String str, int n) {
       String newStr = "";
       for(int i=1 ; i<=n ; i++) // for loop iterates n times
       {
           newStr = newStr + str; // in each iteration string is concetanated
       }
      
       return newStr; // concatenated string is returned
   }
  
   //Create a method Given a string, return the string where all of the "z"
   //Have been removed. Except do not remove a z at the start
   //or end
   //Ex.
   //stringT("zHelloz") -> "zHelloz"
   //stringT("nozthaznks") -> "nothanks"
   //stringT("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
   public static String stringZ(String str){      
      
       String newStr = str.substring(0,1); // appends first character to string
      
       String newS = str.substring(1, str.length()-1);
       newStr = newStr + newS.replace("z",""); // using replace method replaces every z with empty string execept first and last character
      
       //char ch = str.charAt(str.length()+1)
       newStr = newStr + str.substring(str.length()-1, str.length()); // apppends last character to string
       return newStr; // returns the string          
      
   }
   //Create a method that contains a while loop that allows for
   //The user to input numbers until the number 0 is entered. Each time a number is
   //entered the total will be summed and then prompted for a second number.
   //NOTE: I require the use of scanner here to get each integer from the user
   //Assume the numbers entered are integers
   //Also note that the method is void meaning you will not need to return anything
   //It will need to sysout the numbers however
   //Below is a sample output what I would like
   // I will add up the numbers you give me....
   // Number: 12
   // The total so far is 12.
   // Number: 2
   // The total so far is 14.
   // Number: 3
   // The total so far is 17.
   // Number: 4
   // The total so far is 21.
   // Number: 1
   // The total so far is 22.
   // Number: 2
   // The total so far is 24.
   // Number: 3
   // The total so far is 27.
   // Number: 0
   // TOTAL ENDED --- The total is 27.
   public static void sums(){
       Scanner sc = new Scanner(System.in);
       int input=0, total=0;
       do // this do while loop iterates until 0 is not entered
       {
           System.out.print("Number: ");
           input = sc.nextInt(); // takes input
           total = total + input; // sums up the number
           System.out.println("The total so far is "+total+".");          
       }      
       while (input != 0);   //checks if input is not equal to 0 then then again so block executes
       System.out.println("TOTAL ENDED --- The total is "+total+".");
      
       sc.close(); // closes the scanner
      
   }
   public static void main(String[] args) {
       System.out.println("Testing for method loopE");
       System.out.println(loopE("eat"));
       System.out.println(loopE("eeat"));
       System.out.println(loopE("eeeat"));
       System.out.println(loopE("eeeeat"));
      
       System.out.println("\n\nTesting for method stringTimes");
       System.out.println(stringTimes("Code",2));
       System.out.println(stringTimes("Code",4));
      
       System.out.println("\n\nTesting for method stringZ");
       System.out.println(stringZ("zHelloz") );
       System.out.println(stringZ("nozthaznks"));
       System.out.println(stringZ("xksiazdjaasldzsajzasdz") );
      
       System.out.println("\n\nTesting for method sums");
       sums();// calls method sums
      
   }
}
