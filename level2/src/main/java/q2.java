import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();

        // Calculating area in square centimeters
        double areaCm = 0.5 * base * height;

        // Conversion factor: 1 inch = 2.54 cm → 1 sq in = (2.54 * 2.54) sq cm
        double areaIn = areaCm / (2.54 * 2.54);

        // Printing results
        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);

        sc.close();
    }
}