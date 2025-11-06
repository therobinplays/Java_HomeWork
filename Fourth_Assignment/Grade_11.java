import java.util.Scanner;

public class Grade_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----- Hi, Guys Welcome to Grade 11 -----\n");

        int service;

        do {
            System.out.println("The Services we that offers are:\n");
            System.out.println("1. Software Development.");
            System.out.println("2. Automation.");
            System.out.println("3. Web Development.");
            System.out.println("0. Exit \n");

            System.out.println("Enter the service that you want from us: ");
            service = scan.nextInt();

            switch (service) {
                case 1:
                    System.out.println("You have successfully entered into Software Development.\n");
                    break;

                case 2:
                    System.out.println("You have successfully entered into Automation.\n");
                    break;

                case 3:
                    System.out.println("You have successfully entered into Web Development.\n");
                    break;

                case 0:
                    System.out.println("----- Exiting the System Successfully. -----");
                    System.out.println("----- Hope You will visit us again. -----\n");
                    break;

                default:
                    System.out.println("Invalid Service! We do not provide that service.\n");
            }
        } while (service != 0);

        scan.close();
    }
}
