import java.util.Scanner;
public class Task3 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float Total = pencil + pen + eraser;
        float Tax = Total * (18.0f / 100);
        System.out.println("Cost of pencil: "+pencil);
        System.out.println("Cost of pen: "+pen);
        System.out.println("Cost of eraser: "+eraser);
        System.out.println("Total tax: "+Tax);

        
  
    }
    
}
