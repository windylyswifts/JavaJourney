package Lesson10_printf;

public class L10 {
    public static void main(String[] args) {
        
        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        /* 
            FOR FLOATS
            + = output a plus
            , = comma grouping seperator, basically for formal numbering
            ( = negative numbers are enclosed in ()
            space = display a minus if negative, space if positive

        */
        String name = "isiah";
        char firstletter = 'I';
        int age = 19;
        double height = 5.4;
        boolean isEmployed = true;


        System.out.printf("hello %s\n", name);
        System.out.printf("letter %c\n", firstletter);
        System.out.printf("age %d\n", age);
        System.out.printf("height % f\n", height);
        System.out.printf("is employed?: %b\n", isEmployed);
    
    }
}
