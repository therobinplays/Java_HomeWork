import java.util.Scanner;

public class AdditionMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int matrixI[][] = new int[3][3];
        int matrixII[][] = new int[3][3];
        int sum[][] = new int[3][3];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixI[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixII[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrixI[i][j] + matrixII[i][j];
            }
        }

        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
