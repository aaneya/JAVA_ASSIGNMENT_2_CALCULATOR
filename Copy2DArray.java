import java.util.Scanner;
public class Copy2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] original = new int[4][5];
        System.out.println("Enter 20 numbers for the 4x5 array:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                original[i][j] = sc.nextInt();
            }
        }
        int[][] copy = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                copy[i][j] = original[i][j];
            }
        }
        System.out.println("The copied array is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(copy[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
