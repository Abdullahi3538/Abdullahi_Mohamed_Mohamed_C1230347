import  java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("soo gali numbers ka.");
        System.out.println("Type 'n' to exit.");
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.print("Enter an integer: ");
            String userInput = input.next();

            // Check if the input is 'n' (to stop)
            if (userInput.equalsIgnoreCase("n")) {
                break; // exit the loop
            }

            try {
                // Try converting to integer
                int number = Integer.parseInt(userInput);
                sum += number;
            } catch (NumberFormatException e) {
                // If input is not a number, print invalid input
                System.out.println("Invalid input");
            }
        }

        System.out.println("Sum is " +sum);

    }
}
