import java.util.Scanner;

public class Number_Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String access;
        
        System.out.println("----- Mr. Digi Converter -----");
        
        do {
            System.out.println("Do you want to perform a conversion ?");
            System.out.println("If Yes, press --> Yes.");
            System.out.println("If No, press --> No.");
            access = scan.nextLine().trim();

            if (access.equalsIgnoreCase("No")) {
                System.out.println("----- Exiting the process. -----");
                break;
            }

            System.out.println("Enter a number between (0-9): ");
            int theNum = scan.nextInt();
            scan.nextLine();

            if (theNum < 0 || theNum > 9) {
                System.out.println("Invalid input Idiot ! Please enter a number between 0 and 9.");
            } else {
                switch (theNum) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }

        } while (access.equalsIgnoreCase("Yes"));

        scan.close();
    }
}
