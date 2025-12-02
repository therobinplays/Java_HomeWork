import java.util.Scanner;

public class Eligibility_Checker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("----- Mr. Eligibility Checker -----");

        System.out.println("Enter your age for the eligibility.");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("You are Eligible to vote.");
        else
            System.out.println("You are not eligible to vote.");
    }
}
