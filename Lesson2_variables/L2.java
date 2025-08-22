package Lesson2_variables;

public class L2 {
    public static void main(String[] args) {
        //  variable = a reusable container for a value
        //           = a variable behaves as if it was the value it contains 

        //  Primitive = simple value stored directly in memory (stack)
        //  Reference = memory address (stock) that points to the (heap)

        //  Primitive vs Reference
        //  int          string
        //  double       array
        //  char         object
        //  boolean      

        //  2 Steps to creating a variable
        //  1. declaration
        //  2. assignment

        int age = 19; 
        double Pi = 1.43; //This is float basically in C
        char gpa = '1'; 
        boolean isStudent = true;//camelCase format, good practice 

        System.out.println("Currently taking this journey on:" + age );
        System.out.println(Pi);
        System.out.println(gpa);
        if (isStudent) { //by default, if is true so we dont need "isStudent == true" to set the condition
            System.out.println("deadass in Second Year huh?");
        }
        else{
            System.out.println("Liar dawg");
        }

        String name = "Isiah W. ALinab";

        System.out.println(name);
        System.out.println("So right now you are currently " + age + " and with a GPA of " + gpa); //kinda weird

    }
}
