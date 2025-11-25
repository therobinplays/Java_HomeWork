import java.util.Scanner;

public class Identifier {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String access;

        System.out.println("----- Mr. Identifier -----");

        while (true) {
            System.out.println("Do you want to check a number?");
            System.out.println("If Yes, press --> Yes.");
            System.out.println("If No, press --> No.");
            access = scan.nextLine().trim();

            if (access.equalsIgnoreCase("No")) {
                System.out.println("----- Exiting the process. -----");
                break;
            }

            if (!access.equalsIgnoreCase("Yes")) {
                System.out.println("Invalid input! Please type Yes or No.");
                continue;
            }

            System.out.println("Enter a number:");
            double n = scan.nextDouble();
            scan.nextLine();

            if (n > 0) {
                System.out.println(n + " is a Positive number.");
            } else if (n < 0) {
                System.out.println(n + " is a Negative number.");
            } else {
                System.out.println("The number is Zero.");
            }
        }

        scan.close();
    }
}
