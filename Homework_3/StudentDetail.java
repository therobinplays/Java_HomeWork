// A Program for Displaying Name,Class and Address.

import java.util.Scanner;
public class StudentDetail
{
    public static void main (String[] args)
    {
        System.out.println("----Enter your Detail----");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = scan.nextLine();
        
        System.out.println("Enter Your Class : ");
        int stdclass= scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter your Address : ");
        String address = scan.nextLine();
        
        System.out.println("----Student Detail----");
        
        System.out.println("Your Name is : " + name);
        System.out.println("You Study in Class : " + stdclass);
        System.out.println("Your Live in:" + address);
        
        scan.close();
        
        
    }
}
