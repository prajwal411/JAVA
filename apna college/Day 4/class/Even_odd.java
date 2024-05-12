import java.util.Scanner;

public class Even_odd {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N % 2 == 0){
            System.out.print(N + " is Even");
        }
        else{
            System.out.print(N + " is Odd");
        }
    
}}
