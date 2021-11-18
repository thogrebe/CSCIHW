package HW2;

public class MathGames {


    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.

    public static double hypotenuse(double base, double perpendicular) {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(perpendicular, 2));
    }

 // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method 

    public static char letterGrade(double grade) {
        int roundedUp = (int) Math.ceil(grade);
        if (roundedUp >= 90) return 'A';
        else if (roundedUp >= 80) return 'B';
        else if (roundedUp >= 70) return 'C';
        else if (roundedUp >= 60) return 'D';
        return 'F';
    }

    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 

    public static double calculateTip(double totalBill, int people, double tipPercentage) {

        double tipAmount = Math.ceil(totalBill * tipPercentage / 100);

        double share = tipAmount / people;
        return share;

    }

    public static void main(String[] args){

        System.out.println("Hypotenuse(3,4) = " + hypotenuse(3, 4));
        System.out.println("letterGrade(69.3) = " + letterGrade(69.3));
        System.out.println("calculateTip(100,3,18) = " + calculateTip(100, 3, 18));
    }
}
    
  





    

    
 


    // you do not need this main if you want to make a tester class

