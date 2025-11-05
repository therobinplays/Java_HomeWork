import java.util.Scanner;

public class Season_Finder { 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String access;
        
        System.out.println("----- Mr. Season Finder -----");
        
        do {
            System.out.println("Do you want to find season name?");
            System.out.println("If Yes, press -> Yes.");
            System.out.println("If No, press -> No.");
            access = scan.nextLine().trim();
            
            if (access.equalsIgnoreCase("No")) {
                System.out.println("----- Exiting the process. -----");
                break;
            }
            
            System.out.println("Enter the name of a month to find the season:");
            String theMonth = scan.nextLine().trim().toLowerCase();
            
            String theSeason = null;
            
            switch (theMonth) {
                case "january":
                case "february":
                case "december":
                    theSeason = "Winter";
                    break;
                    
                case "march":
                case "april":
                case "may":
                    theSeason = "Spring";
                    break;
                    
                case "june":
                case "july":
                case "august":
                    theSeason = "Summer";
                    break;
                    
                case "september":
                case "october":
                case "november":
                    theSeason = "Autumn";
                    break;
                    
                default:
                    theSeason = null;
            }
            
            if (theSeason != null) {
                System.out.println("According to your provided month, " + theSeason + " season exists there.");
            } else {
                System.out.println("You have provided an invalid month. Please provide a valid month, Idiot !");
            }
            
        } while (access.equalsIgnoreCase("Yes"));
        
        scan.close();
    }
}
