import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Principle: ");
        int principal = sc.nextInt();
        System.out.println("Enter a Rate: ");
        int rate= sc.nextInt();
        System.out.println("Enter a Time: ");
        int time = sc.nextInt();
        double Simple_Interest = (principal * rate * time )/100;
        System.out.println("Simple Interest: "+Simple_Interest);
    }
    
}
