public class Large_Finder {
    public static void main(String[] args) {

        System.out.println("----- Mr.Large Finder -----");

        int a = 10, b = 20, c = 5;

        if (a >= b && a >= c) {
            System.out.println(a + " is largest");
        } 
        else if (b >= a && b >= c) {
            System.out.println(b + " is largest");
        } 
        else {
            System.out.println(c + " is largest");
        }

    }
}
