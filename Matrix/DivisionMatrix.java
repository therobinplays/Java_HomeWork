import java.util.Scanner;

public class DivisionMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int matrixI[][] = new int[3][3];
        int matrixII[][] = new int[3][3];
        double div[][] = new double[3][3];

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

                if (matrixII[i][j] != 0) {
                    div[i][j] = (double) matrixI[i][j] / matrixII[i][j];
                } else {
                    div[i][j] = 0;
                    System.out.println("Cannot divide by zero at position [" + i + "][" + j + "]");
                }
            }
        }

        System.out.println("Division of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(div[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
