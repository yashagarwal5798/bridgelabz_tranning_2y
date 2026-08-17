import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        int radius = sc.nextInt();
        double area =   (radius * radius) *3.14;
        System.out.println("Area of circle: "+area);
    }
}
