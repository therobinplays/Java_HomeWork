import java.util.Scanner;

public class Guess {
    int value;

    Guess(int value) 
    {
        this.value = value;
    System.out.println("----- Mr. Integer Finder -----");
    }
    
    
    void check() 
    {
        Scanner scan = new Scanner(System.in);

        while (true) 
        {
            System.out.print("Enter the secret number: ");
            int userInput = scan.nextInt();

            if (userInput > value) 
            {
                System.out.println("Your provided number " + userInput + " is greater than the Secret Number.");
            } 
            
            else if (userInput < value) 
            {
                System.out.println("Your provided number " + userInput + " is smaller than the Secret Number.");
            } 
            
            else 
            {
                System.out.println("You guess that the Secret number is " + userInput + " , thats absolutely correct !");
                break;
            }
        }

        scan.close();
    }

    public static void main(String[] args) {
        Guess g = new Guess(15);
        g.check();
    }
}
