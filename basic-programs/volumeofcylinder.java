import java.util.Scanner;
public class volumeofcylinder {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Of Cylinder:");
        int radius=sc.nextInt();
        System.out.println("Enter Height Of Cylinder :");
        int Height=sc.nextInt();
        System.out.println("Volume Of Cylinder is : "+(Math.PI*radius*radius*Height));
    }
} 
    

