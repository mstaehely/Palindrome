import java.util.Scanner;

/**
 * Basic palindrome detection. Procedural rather than OOP.
 *
 * @author Matthew Staehely
 * @version Autumn 2015
 */
public class isPalindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String parse = "";
        System.out.print("Enter the word or sentence: ");
        String string = scanner.nextLine();
        scanner = new Scanner(string);
        while(scanner.hasNext()) {
            parse += scanner.next();
            System.out.println(parse);
        }
        boolean pal = checkPalindrome(parse.toLowerCase());
        if(pal) {
            System.out.printf("\"%s\" is a palindrome.\n", string);
        } else {
            System.out.printf("\"%s\" is not a palindrome.\n", string);
        }
    }
    public static boolean checkPalindrome(String string){
        if(string == null || string.length() == 0){
            return true;
        } else {
            int start = 0;
            int end = string.length() - 1;
            while(start <= end) {
                if (string.charAt(start) != string.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
}
