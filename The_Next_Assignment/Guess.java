import java.util.Scanner;

public class Guess {
    int value;
    int count = 0;

    Guess(int value) {
        this.value = value;
        System.out.println("----- Mr. Integer Finder -----");
    }

    void check() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the secret number: ");
            int userInput = scan.nextInt();
            count++;

            if (userInput == value) 
            {
                System.out.println("You guessed the Secret Number " + value +
                        " correctly!");
                break;
            }
            
            else if (userInput == value * 2) 
            {
                System.out.println("Your provided number " + userInput +
                        " is double of the Secret Number.");
            }
            
            else if (userInput > value + 20) 
            {
                System.out.println("Your provided number " + userInput +
                        " is too greater than the Secret Number.");
            }
            
            else if (userInput > value) 
            {
                if (userInput <= value + 5) 
                {
                    System.out.println("Your provided number " + userInput +
                            " is very close, but greater than the Secret Number.");
                } 
                
                else 
                {
                    System.out.println("Your provided number " + userInput +
                            " is greater than the Secret Number.");
                }
            }
            
            else if (userInput < value - 20) 
            {
                System.out.println("Your provided number " + userInput +
                        " is too smaller than the Secret Number.");
            }
            
            else 
            {
                if (userInput >= value - 5) {
                    System.out.println("Your provided number " + userInput +
                            " is very close, but smaller than the Secret Number.");
                } 
                
                else 
                {
                    System.out.println("Your provided number " + userInput +
                            " is smaller than the Secret Number.");
                }
            }
        }

        System.out.println("You guessed the Secret Number in " + count + " attempts.");
        scan.close();
    }

    public static void main(String[] args) {
        Guess g = new Guess(15);
        g.check();
    }
}

