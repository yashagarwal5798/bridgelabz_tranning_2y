import java.util.Scanner;

public class Average_of_Three {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a first number: ");
        int a = sc.nextInt();
        System.out.println("enter a second number: ");
        int b = sc.nextInt();
        System.out.println("enter a third number: ");
        int c = sc.nextInt();

        double ave = (a+b+c)/3;
        System.out.println("Average of Three Number: "+ave);
    }
    
}
