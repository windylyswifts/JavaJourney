package Lesson14_substring;

public class L14 {
    public static void main(String[] args) {
        // .substring() =  A method used to extract a portion of a string
        //                 string.substring(start, end)

        String email = "windsdds@gmail.com";
        String username = email.substring(0, 6);
        String domain = email.substring(4, 6);

        System.out.println(username);
        System.out.println(domain);
    }
}
