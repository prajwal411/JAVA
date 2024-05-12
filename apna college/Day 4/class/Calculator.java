import java.util.Scanner;

public class Calculator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter value of b: ");
        int b = sc.nextInt();

        System.out.println("Enter Oprator: ");
        char Operator = sc.next().charAt(0);

        switch(Operator){
            case '+': System.out.println(a+b);
            break;

            case '-': System.out.println(a-b);
            break;

            case '*': System.out.println(a*b);
            break;

            case '/': System.out.println(a/b);
            break;

            default: System.out.println("My calculator is not so advance");
        }
    }
    
}
