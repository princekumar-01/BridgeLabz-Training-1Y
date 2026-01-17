import java.util.Scanner;
public class parimeterofrectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length :");
        int length=sc.nextInt();
        System.out.println("Enter Width :");
        int width=sc.nextInt();
        System.out.println("Parimeter of Recatangle is"+ (2*(length + width)));   
        sc.close();
    }
}
