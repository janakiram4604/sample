
//checking palindrome
import java.util.Scanner;

public class Checking_palindrome {
    public static void main(String[] args) {
        Scanner pal = new Scanner(System.in);
        String name = pal.nextLine().toLowerCase();
        String reverse = "";
        String clean_input = name.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += clean_input.charAt(i);
        }
        if (name.equals(reverse)) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
        pal.close();
    }
}

