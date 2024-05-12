import java.util.Scanner;
public class Pass_Fail {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float Marks = sc.nextFloat();
    if(Marks < 0.33){
        System.out.print("Fail");
    }
    else{
        System.out.println("Pass");
    }
    }
}
