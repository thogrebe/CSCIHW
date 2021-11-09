package HW1;
import java.util.Scanner;
public class Main {
static Scanner keyboard = new Scanner(System.in);

public static void main(String[] args) {

// Create an object that will make a Pyramid (see Pyramid.java for more)

Pyramid.Output(); //creating object for Pyramid
   
// Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)

   Adlibs ad = new Adlibs(); //creating object for Adlibs
   System.out.println("Enter name: "); //for name
   String name= keyboard.nextLine();
   System.out.println("Enter age: "); //for age
   String age= keyboard.nextLine();
   System.out.println("Enter favorite color: "); //for color
   String color= keyboard.nextLine();
   System.out.println(ad.story(name,age,color)); //calling function story from Adlibs

// Create an object that implements a method which will accept a string, an integer, and a char and will replace the char in thestring at the given integer (See Replace.java for more info)

   Replace r = new Replace(); //creating object for Replace
   System.out.println(r.charReplace("Tori", 2, 'i'));
   System.out.println(r.charReplace("I MAKE BREAD", 2, 'T'));
   }
}