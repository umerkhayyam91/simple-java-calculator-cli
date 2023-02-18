import java.util.Scanner;

public class Calculator {

    static Scanner input = new Scanner(System.in);

    public static void showAnswer(int answer) {
        System.out.println("--> Answer is " + answer + "\n");
    }

    public static void add() {
        System.out.println("---- Addition ---- ");
        System.out.print("Enter 1st number: ");
        int x1 = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int x2 = input.nextInt();

        int ans1 = x1 + x2;
        showAnswer(ans1);
    }

    public static void multiply() {
        System.out.println("---- Multiply ---- ");
        System.out.print("Enter 1st number: ");
        int x1 = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int x2 = input.nextInt();

        int ans1 = x1 * x2;
        showAnswer(ans1);
    }

    public static void subtract() {
        System.out.print("Enter 1st number: ");
        int x1 = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int x2 = input.nextInt();

        int ans1 = x1 - x2;
        showAnswer(ans1);
    }

    public static void divide() {
        System.out.println("---- Divide ---- ");
        System.out.print("Enter 1st number: ");
        int x1 = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int x2 = input.nextInt();

        while (x2 == 0) {
            System.out.println("Den. cannot be zero. Try again\n");
            System.out.print("Enter 2nd number: ");
            x2 = input.nextInt();
        }

        int ans1 = x1 / x2;
        showAnswer(ans1);
    }

    public static int showMenu() {
        System.out.println(
                "Choose from the following\n 1. Addition \n 2. Multiplication \n 3. Subtraction \n 4. Division \n 5. Exit");
        System.out.print("Enter a corresponding digit: ");
        int digit = input.nextInt();
        return digit;
    }

    public static void main(String[] args) {

        int digit = -1;

        while (digit <= 4) {

            digit = showMenu();

            if (digit == 1) {
                add();
            } else if (digit == 2) {
                multiply();
            } else if (digit == 3) {
                subtract();
            } else if (digit == 4) {
                divide();
            }

        }
        System.out.println("\n --- Good bye, see you soon :) ---\n");
        input.close();

    }

}
