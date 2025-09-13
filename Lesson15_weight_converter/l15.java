package Lesson15_weight_converter;
import java.util.Scanner;

public class l15 {
    public static void main(String[] args) {
        int choice, last, error = 0;
        double value;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO THE WEIGHT CONVERTER");
        System.out.print("Enter Value:");
        value = scanner.nextDouble();
        
        System.out.println("is it on:");
        System.out.println("1.kg?");
        System.out.println("2.Pounds?");
        System.out.println("3.Grams?");
        System.out.println("4.Ounces");
        System.out.println("Enter number:");
        choice = scanner.nextInt();
        System.out.println("GREAT!");
        
        if (choice == 1) {//kg
            System.out.println("WHAT WILL YOU CONVERT IT INTO?");
            System.out.println("1.Pounds?");
            System.out.println("2.Grams?");
            System.out.println("3.Ounces");
            System.out.println("Enter number:");
            last = scanner.nextInt();
            if (last == 1) 
                value *= 2.20462;
            else if(last == 2)
                value *= 1000;
            else if(last == 3){
                value *= 1000;
                value /= 28.3495;
            }
            else{
                System.out.println("INVALID ANSWER!");
                error = 1;
            }
        }
        else if(choice == 2){ //Pounce
            System.out.println("WHAT WILL YOU CONVERT IT INTO?");
            System.out.println("1.kg?");
            System.out.println("2.Grams?");
            System.out.println("3.Ounces");
            System.out.println("Enter number:");
            last = scanner.nextInt();
             if (last == 1) 
                value /= 2.20462;
            else if(last == 2){
                value /= 2.20462;
                value *= 1000;
            }
            else if(last == 3){
                value /= 2.20462;
                value *= 1000;
                value /= 28.3495;
            }
            else
                System.out.println("INVALID ANSWER!");
                error = 1;
        }
        else if(choice == 3){//Grams
            System.out.println("WHAT WILL YOU CONVERT IT INTO?");
            System.out.println("1.kg?");
            System.out.println("2.Pounds?");
            System.out.println("3.Ounces");
            System.out.println("Enter number:");
            last = scanner.nextInt();
            if (last == 1) {
                value /= 1000;
            }
            else if(last == 2){
                value /= 1000;
                value /= 2.20462;
            }
            else if(last == 3){
                value /= 28.3495;
            }
            else
                System.out.println("INVALID ANSWER!");
                error = 1;
        }
        else if(choice == 4){//Ounces
            System.out.println("WHAT WILL YOU CONVERT IT INTO?");
            System.out.println("1.kg?");
            System.out.println("2.Pounds?");
            System.out.println("3.Grams?");
            System.out.println("Enter number:");
            last = scanner.nextInt();
            if (last == 1) {
                value *= 28.3945;
                value /= 1000;
            }
            else if(last == 2){
                value *= 28.3945;
                value /= 1000;
                value *= 2.20462;
            }
            else if(last == 3){
                value *= 28.3495;
            }
            else
                System.out.println("INVALID ANSWER!");
                error = 1;
        }
        else
            System.out.println("INVALID ANSWER!");

        if (error == 1) {
            System.out.println("something was wrong");
        }
        else{
            System.out.printf("Here is the result:%.2f", value);
        }

        scanner.close();
    }
}
