import java.util.Scanner;

public class Income_Tax {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float Income = sc.nextFloat();
        float Tax = 0;
        if(Income < 500000){
            Tax = Income * 0;
        }
        else if(Income <= 500000 && Income >= 1000000){
            Tax = Income * 0.2f;
        }
        else{
            Tax = Income * 0.3f;
        }
        System.out.println("Tax to be paid " + Tax);
    }
    
}
