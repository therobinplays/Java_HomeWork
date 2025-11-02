// A Program for Displaying Name,Class and Address.

import java.util.Scanner;
public class PersonalDetail
{
    public static void main (String[] args)
    {
        System.out.println("----Enter your Detail----");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Hobby: ");
        String hobby = scan.nextLine();
        
        System.out.println("Enter your Age: ");
        int age = scan.nextInt();
        scan.nextLine();
        
        System.out.println("----Your Biodata----");
        
        System.out.println("Your Hobby is : " + hobby);
        System.out.println("You are " + age +" years old.");
        
        scan.close();
        
        
    }
}
