import java.util.Scanner;
public class DoubleDimensionalArray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int[][]arr = new int[3][4];

        System.out.println("Enter 12 number for the3x4 array:");
        for(int i = 0;i<3; i++){
            for (int j = 0;j<4; j++ ){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 3x4 array is:");
        for (int i = 0; j < 3; j++){


            for (i = 0; j < 4; j++){

                System.out.println(arr[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
*/



