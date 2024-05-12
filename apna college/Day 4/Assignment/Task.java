/*Write a Java program to get a number from the user and print whether it is
positive or negative.*/
import java.util.Scanner;
// package apna college.Day 4.assignment;

public class Task{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0){
            System.out.print("Positive");
        }
        else if(number == 0){
            System.out.print("Zero");
        }
        else{
            System.out.println("Negative");
        }
    }
    
}
