import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a base: ");
        int base = sc.nextInt();
        System.out.println("Enter a exponent: ");
        int exp  = sc.nextInt();

        double power = Math.pow(base , exp);
        System.out.println("Power: "+power);

    }
    
}
