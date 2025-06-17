import  java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int i;
        int Prime = 1;

        System.out.print("Enter a Number: ");
        num = input.nextInt();
//
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                Prime = 0;
                break;
            }
        }
        if (Prime == 1) {
            System.out.println(" it's a Prime Number.");
        } else {
            System.out.println(" it's not a Prime Number.");
        }

    }
}
