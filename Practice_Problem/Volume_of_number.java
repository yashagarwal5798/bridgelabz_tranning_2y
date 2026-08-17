import java.util.Scanner;

public class Volume_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        int radius = sc.nextInt();
        System.out.println("Enter a height: ");
        int height = sc.nextInt();
        double volume = 3.14 * (radius * radius) * height;
        System.out.println("Volume of cylinder: "+volume);
    }
}
