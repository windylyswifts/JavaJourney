package Lesson9_math_class;

public class L9 {
    public static void main(String[] args) {
        double result;

//        System.out.println(Math.PI); //We dont need to assing a variable to look for PI
//        System.out.println(Math.E);
        
        result = Math.pow(2, 4); // the first value is the base and the exponent is the second
        System.out.println(result);
        result = Math.abs(-1); //its positive
        System.out.println(result);
        result = Math.sqrt(9);
        System.out.println(result);
        result = Math.round(3.14);
        System.out.println(result);
        result = Math.ceil(3.14);
        System.out.println(result);
        result = Math.floor(3.99);
        System.out.println(result);
        result = Math.max(10, 20);
        System.out.println(result);
        result = Math.min(-1, 10);
        System.out.println(result);

        
    }
}
