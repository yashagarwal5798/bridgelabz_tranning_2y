import java.util.Scanner;

public class calsicus {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a celsius: ");
     int celsius = sc.nextInt();
     int fahrenheit = (celsius * 9/5) + 32;
     System.out.println(" Fahrenheit: "+fahrenheit);

    }
}
