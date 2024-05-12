import java.util.Scanner;

public class Check_largest_three_no {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String Largest;
        if(a >= b && a >= c){
            Largest = "a";
        }
        else{
            if(b >= c){
                Largest = "b";
            }
            else{
                Largest = "c";
            }
        }
        System.out.println("Largest is: " + Largest);


    }
}
