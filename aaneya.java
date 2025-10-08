import java.util.Scanner;

public class aaneya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
            sum = sum + number[i];
        }
        System.out.println("Sum of all elements is " + sum);
        sc.close();
    }
}

