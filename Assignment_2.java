import  java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            System.out.print("Enter a string: ");
            String s = input.nextLine();

            // The index of the first character in the string
            int low = 0;

            // The index of the last character in the string
            int high = s.length() - 1;

            boolean isPalindrome = true;
            while (low < high) {
                if (s.charAt(low) != s.charAt(high)) {
                    isPalindrome = false;
                    break;
                }

                low++;
                high--;
            }

            if (isPalindrome)
                System.out.println(s + " is a palindrome");
            else
                System.out.println(s + " is not a palindrome");
    }
}
