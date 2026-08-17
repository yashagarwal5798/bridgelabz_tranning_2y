import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Kilometer");
        int kilo = sc.nextInt();
        double  miles = kilo * 0.621371;
        System.out.println("Miles "+miles );

    }
    
}
