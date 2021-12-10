package PROJECT2;

import java.util.Random;
import java.util.Scanner;

// Write a program that will generate a selected amount of Dice and toss them into an array.
// For example:
// 10 Dice
// 2 1 2 4 5 6 2 1 3 4
// After collecting the rolls mark off how many times the same number is rolled
// The example above has none.
// Example with a run and same numbers:
// 2 1 1 1 4 5 3 4 5 6
// Mark in paraenthese the runs that have the same number.
// Final Example:
//  2 (1 1 1) 4 5 3 4 5 6
// Note you only need to mark the first group of the same number so for this example:
// 2 (1 1 1) 4 5 5 5 3 6
// You only need to mark off the group of 1's not the group of 5's
// However if you do mark them off that is fine too
// An example with every group marked off would be:
// 2 (1 1 1) 4 (5 5 5) 3 6
// Again Marking each group is optional. The only thing I require is the first group to be marked.
// 2 (1 1 1) 4 5 5 5 3 6

// Hint 1: I have given you some code to get started but you will need to fill in the rest. A die has 6 sides.
// Hint 2: You will want to make int array to hold the values
// Hint 3: You might find it helpful to create running tally variables such as:
//         longestLength , currentLength , longestLengthIndex , currentLengthIndex, currentNum
//         This will help you keep track of runs when they occur
// Hint 4: To print the output you might want to use a for loop and loop through each index and use the variables above to 
//         Denote if you should insert a "(" or ")"


// My hints are related to the way I completed the code but there are many ways to do it! 


public class Dice {
    Random generator = new Random();
    Scanner keyboard = new Scanner(System.in);

    public void DiceCount() {
        int sides = 6;
        int longestLength = 1;
        int currentLength = 1;
        int longestLengthIndex = 0;
        int currentLengthIndex = 1;
        int currentNum = -1;
        System.out.println("Enter the amount of dice...");
        int dice = keyboard.nextInt();
        int[] diceRolls = new int[dice];
        for(int i = 0; i<dice; i++){
            diceRolls[i] = generator.nextInt(sides);
            System.out.print(diceRolls[i] + " ");
            if(currentNum==diceRolls[i]){
                //this code runs if the current number is equal to the random number generated at index i
                // for example, if the numbers generated were 1 2 2
                // if the first random number generated is 1, this is at index 0. Currently, the current num is -1
                // so, -1 does not equal 1, so then it goes to after the else statement, making the current num = diceRolls[i]
                // at index 1, if the number generated was 2, now it can go through the if statement because at mentioned in the comment before,
                // the current num == diceRolls[i], so we increment current length by 1, making it 2 now. The next if statement would occur now because
                // the current length is 2 the longest length is 1 at this point, so we update the index of the current and longest length. 
                // the longest length index is 1, making that equal to the current length index
                // now the longest length is equal to the current length, making it 2.
                // so we go back to the beginning, still incrementing the current length by 1
                // at index 2, the number generated was 2, so now there is a run. Now the current length is 3. Since we established that the current num is equal to diceRolls[i],
                // we can continue to the next if statement, now the current length is 3 and the longest length is 2, so it goes through the process again
                // longest length index and current length index are at 2, and now the longest length is equal to the current length, making it 3.
                currentLength++;
                if(currentLength>longestLength){
                    longestLengthIndex=currentLengthIndex;
                    longestLength=currentLength;
                }
            }else{
                currentLength=1;
                currentLengthIndex=i;
            }
            currentNum=diceRolls[i];
        }
        System.out.println();
        for (int i = 0; i < dice; i++)
            System.out.print((i == longestLengthIndex ? "(" : "") + diceRolls[i] + (i == (longestLengthIndex + longestLength - 1) ? ") " : " "));
            // for each roll, it sees if the index i is equal to the index of the longest length and adds one parenthesis around that number and
            // adds the second parenthesis at the end of the next number if there is a run
            // example: 1 2 2
            // index 0, number is 1. 1 is less than dice which is 3. So 0 doesn't equal the longes length index
            // so it goes to the next index which is 1, at number 2. And the next index is 2 at number 2.
            // so now index 1 is equal to the longest length index, so it adds a parenthesis before it and then outputs the number. And then index 1 doesn't equal
            // the longest length index + longest length - 1, so it goes to the next index which is 2 at number 2
            // index 2 doesn't equal the longest length index, so it doesn't add a ( , so it goes to the next part
            // index 2 equals the longest length index + longest length-1 which is the last number of the run, and then it adds )
    }

    public static void main(String[] args) {
        Dice die = new Dice();
        die.DiceCount();
    }
}
