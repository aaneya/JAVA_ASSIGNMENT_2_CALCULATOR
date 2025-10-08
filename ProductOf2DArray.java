import java.util.Scanner;
public class ProductOf2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        
        System.out.println("Enter 25 numbers for the 5x5 array:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                arr[i][j] = sc.nextInt();
            }
        }
        long product = 1; 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                product *= arr[i][j];
            }
        }
        System.out.println("The product of all elements is: " + product);

        sc.close();
    }
}