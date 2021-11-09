package HW1;
import java.util.Scanner;
// make a method that accepts 3 Strings (Someones name, age, and favorite color and then returns a story about them)
// Hint1: The objects name is Adlibs and you require a name age and favoriteColor all in strings
// Hint2: You will need to return a string. You can concat the variables and the strings together
// Hint3: A sample story if you are lost can be as simple as "Hello! My name is ____, and I am ____, and my favorite
// color is ___"

public class Adlibs {
    static Scanner keyboard = new Scanner(System.in);         //taking 3 String arguments
    public String story(String name, String age, String favoriteColor) {
    String res = "Hello my name is "+name+" and I am "+age+" years old , and my favorite color is "+favoriteColor+".";  //creating a String tells the story
    return res;    //returning the story

    }

}