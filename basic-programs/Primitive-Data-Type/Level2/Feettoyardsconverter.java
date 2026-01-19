import java.util.Scanner;
public class Feettoyardsconverter {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Distance in feet:"); 
       double distance = sc.nextDouble();
       double yards=(distance/3);
       System.out.println("The length in yards is :"+yards+" And in miles is :"+yards/1760);
       sc.close();
}
}
