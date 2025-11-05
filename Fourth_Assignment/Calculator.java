import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String access;

        System.out.println("----- Mr. CALCULATOR -----");

        do {
            System.out.println("Do you want to perform a calculation ?");
            System.out.println("If Yes, press --> Yes.");
            System.out.println("If No, press --> No.");
            access = scan.nextLine().trim();

            if (access.equalsIgnoreCase("No")) {
                System.out.println("----- Exiting the process. -----");
                break;
            }

            System.out.println("Enter the First Value:");
            double firstValue = scan.nextDouble();

            System.out.println("Enter an Operator (+, -, *, /):");
            char theOperator = scan.next().charAt(0);

            System.out.println("Enter the Second Value:");
            double secondValue = scan.nextDouble();

            double result;

            switch (theOperator) {
                case '+':
                    result = firstValue + secondValue;
                    System.out.println("The Sum of these numbers is: " + result);
                    break;

                case '-':
                    result = firstValue - secondValue;
                    System.out.println("The Difference of these numbers is: " + result);
                    break;

                case '*':
                    result = firstValue * secondValue;
                    System.out.println("The Product of these number is: " + result);
                    break;

                case '/':
                    if (secondValue != 0) {
                        result = firstValue / secondValue;
                        System.out.println("The Divison of these numbers is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not possible. What are you trying to do, idiot !");
                    }
                    break;

                default:
                    System.out.println("You have entered Invalid operator, Idiot !");
            }

        } while (access.equalsIgnoreCase("Yes"));

        scan.close();
    }
}
