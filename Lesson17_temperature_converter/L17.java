package Lesson17_temperature_converter;
import java.util.Scanner;

public class L17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature");
        temp = scanner.nextDouble();
        System.out.print("Is it gonna be Celsius or Fahrenheit? (C or F)");
        unit = scanner.next().toUpperCase(); // its okay because we only need a character, newline is a string itself. 
                              //the idea here is after next() we want it upper case. this is chaining method          

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32; 
        System.out.printf("Here's the result:%f", newTemp);

        scanner.close();
    }
}
