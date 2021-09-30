/*import java.util.Scanner;
public class Task_4 {

    public static void main(String[] args) {

        double num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = input.nextDouble();

        System.out.print("Enter second number:");
        num2 = input.nextDouble();

        System.out.print("1. Addition (+).\n" +
                "2. Subtraction (-).\n" +
                "3. Multiplication (*).\n" +
                "4. Division (/).\n");
        System.out.print("Enter operation number:");
        char operators = input.next().charAt(0);
        double result;

        switch (operators)
        {
            case '1':
                result = num1 + num2;
                break;

            case '2':
                result = num1 - num2;
                break;

            case '3':
                result = num1 * num2;
                break;

            case '4':
                result = num1 / num2;
                break;

            default:
                System.out.print("You have entered wrong operator");
                return;
        }
        System.out.println("\nThe result is " +result);
    }
}*/