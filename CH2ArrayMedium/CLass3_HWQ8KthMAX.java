package CH2ArrayMedium;

import java.util.Scanner;

public class CLass3_HWQ8KthMAX {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
          // max nikalo aur array mn dalo aur kth tk.
       


        
    }
    
}
