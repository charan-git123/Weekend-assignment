import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Conversion formula: (°C × 9/5) + 32 = °F
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Printing result
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        sc.close();
    }
}