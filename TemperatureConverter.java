import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = scanner.nextInt();

        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please choose 1 or 2.");
            scanner.close();
            return;
        }

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        double convertedTemperature = 0;
        String fromUnit, toUnit;

        if (choice == 1) {
            convertedTemperature = (temperature * 9 / 5) + 32;
            fromUnit = "Celsius";
            toUnit = "Fahrenheit";
        } else {
            convertedTemperature = (temperature - 32) * 5 / 9;
            fromUnit = "Fahrenheit";
            toUnit = "Celsius";
        }

        System.out.println(temperature + " " + fromUnit + " is equal to " + convertedTemperature + " " + toUnit + ".");
        scanner.close();
    }
}