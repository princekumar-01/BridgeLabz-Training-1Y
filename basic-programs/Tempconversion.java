import java.util.Scanner;
public class Tempconversion {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temp in Celcuis.");
        int a=sc.nextInt();
        System.out.println("Temp in Fahrenheit is :"+((a*9/5)+32));
    }
}
