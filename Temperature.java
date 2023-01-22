import java.util.Scanner;

public class Temperature {
    public static void temperatureConversion(double temp, char unit) {
        double convertedTemp;
        if (unit == 'F') {
            convertedTemp = (temp - 32) * 5 / 9;
            System.out.println(temp + "°F is " + convertedTemp + "°C.");
        } else if (unit == 'C') {
            convertedTemp = (temp * 9 / 5) + 32;
            System.out.println(temp + "°C is " + convertedTemp + "°F.");
        } else {
            System.out.println("Invalid unit. Please enter 'F' for Fahrenheit or 'C' for Celsius.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature :");
        double temp = sc.nextDouble();
        System.out.println("Enter 'F' for Fahrenheit and 'C' for Celsius:");
        char unit = sc.next().charAt(0);
        temperatureConversion(temp, unit);
    }
}
