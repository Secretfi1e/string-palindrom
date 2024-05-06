import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bir soz daxil edin");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String reverseeded = tersword(word);
        boolean isPalindrome = check(word,reverseeded);
        if (isPalindrome) {
            System.out.println("pali");
        } else {
            System.out.println("no pali");
        }
    }

    public static String tersword(String word) {
        String reverseeded ="";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseeded = reverseeded + word.charAt(i);
        }
        return reverseeded;
    }
    public static boolean check (String word ,String reverseeded) {

        return word.equals(reverseeded);

    }
}