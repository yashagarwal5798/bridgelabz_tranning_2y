import java.util.Scanner;

public class Perimeter_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length: ");
        int length = sc.nextInt();
        System.out.println("Enter a width: ");
        int width = sc.nextInt();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter a rectangle: "+perimeter);

    }
}
