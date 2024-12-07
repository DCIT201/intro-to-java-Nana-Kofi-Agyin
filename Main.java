import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("!!Temperature Converter!!");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.println("Please choose an option:");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
            System.out.printf("Temperature in Fahrenheit: %.2f°F", fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
            System.out.printf("Temperature in Celsius: %.2f°C", celsius);
        } else {
            System.out.println("Invalid choice. Please restart the program and select either 1 or 2.");
        }

        scanner.close();
    }
}