package Lesson13_string_methods;

public class L13 {
    public static void main(String[] args) {
        String name = "isiah alinab";
        String name2 = "   isiah      ";
        name2 = name2.trim(); //what this does is that it removes the white spaces of the string before and after.
        String name3 = "Isiah";
        name3 = name3.replace("i", "o");
        
        int length = name.length(); //to identify the length of the string
        char letter = name.charAt(0); //charAT basically checks for the letter from th given index
        int index = name.indexOf("i"); //finds the first letter that matches the index
        int lastindex = name.lastIndexOf("b");
                

        name = name.toUpperCase();
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastindex);
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name3.isEmpty()); //this identify if the variable is empty and this is an boolean function
        if (name3.isEmpty()) { //its great to use this in "if" statements
            System.out.println("You dont have anthing on this");
        }
        System.out.println(name.contains(" ")); // this is useful to locate or find simlar words
        System.out.println(name.equals("isiah"));
        System.out.println(name.equalsIgnoreCase("isiah")); // this elemates caption sensitivity
        
         

    }
}
