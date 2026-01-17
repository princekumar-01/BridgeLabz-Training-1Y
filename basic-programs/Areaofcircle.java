import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle:");
        int radius=sc.nextInt();
        System.out.println("Area Of Circle is : "+(Math.PI*radius*radius));
    }
}