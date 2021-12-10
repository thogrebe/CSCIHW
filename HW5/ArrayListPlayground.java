package HW5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
    // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
        ArrayList<Integer> nums = new ArrayList<Integer>();
        //added elements to the arrayList nums
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        nums.add(11);
        nums.add(12);
        nums.add(13);
        nums.add(14);
        nums.add(15);

    // b) Output the value of the tenth element of the array nums.
    System.out.println(nums.get(10));
    // c) Set the value of the 5th element of the array alpha to 99.
    nums.set(5, 99);
    // d) Set the value of the 9th element of the array alpha to the sum of the 6th and 13th elements of the array nums.
    int sum = nums.get(6) + nums.get(13);
    nums.set(9, sum);


    // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    ArrayList<String> days = new ArrayList<String>();
    // added elements to the arrayList days
    days.add("Monday");
    days.add("Tuesday");
    days.add("Wednesday");
    days.add("Thursday");
    days.add("Friday");
    days.add("Saturday");
    days.add("Sunday");
    // b) output each of the days of the week
    System.out.println(days);
    // c) output the days of the week we have class
    System.out.println(days.get(1));
    System.out.println(days.get(3));
    // d) output the days of the week that we have class
    System.out.println(days.get(0));
    System.out.println(days.get(2));
    System.out.println(days.get(4));
    System.out.println(days.get(5));
    System.out.println(days.get(6));
    // e) change the arrayList to start on Sunday
    String weekDay = "Sunday";
    int switchWeekDay = days.indexOf(weekDay);
    days.remove(switchWeekDay);
    days.add(0, weekDay);
    System.out.println(days);


    // Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    Scanner keyboard = new Scanner(System.in);
    // created arrayList numbers
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    System.out.println("Enter the numbers you want to add...");
    int num;
    num = keyboard.nextInt();
    numbers.add(num);
    // the number typed into terminal is added into arrayList numbers
    // created do while loop
    do {
        num = keyboard.nextInt();
        if(num!=0){
            numbers.add(num);
        }else{
            break;
        }
    } while (num!=0);
    System.out.println("List of numbers in array: ");
    System.out.println(numbers);

    // b) return the largest and smallest number
    int max = Collections.max(numbers);
    System.out.println("Max: " + max);
    int min = Collections.min(numbers);
    System.out.println("Min: " + min);
    // c) return the ArrayList sorted smallest to largest
    Collections.sort(numbers);
    System.out.println("Numbers from smallest to largest: " + numbers);
    // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    int n = numbers.size();
    int total = n % 3;
    int numb = 0;
    int numb2 = 0;
    while(!(total == 0)){
        if(total == 1){
            System.out.println("Please enter another number to create the matrix...");
            numb = keyboard.nextInt();
            numbers.add(numb);
            System.out.println("Please enter another number to create the matrix...");
            numb2 = keyboard.nextInt();
            numbers.add(numb2);
            n = numbers.size();
            total = n % 3;
        }else if(total == 2){
            System.out.println("Please enter another number to create the matrix...");
            numb = keyboard.nextInt();
            numbers.add(numb);
            n = numbers.size();
            total = n % 3;
        }
    }
    System.out.println(numbers);
        //outputted the matrix here
        n = numbers.size();
        int size = n/3;
        int m = size;
        // created arrayList matrix
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        int counter = 0;
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < size; j++) {
                row.add(numbers.get(j+counter));
            }
            counter += 3;
            matrix.add(row);
        }
        for(int i=0; i<matrix.size(); i++){
            for(int j=0; j<matrix.get(i).size(); j++){
                System.out.print(matrix.get(i).get(j));
            }
            System.out.println();
        }
    } 
}
