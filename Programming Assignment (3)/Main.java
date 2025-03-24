import java.util.Scanner;

public class Main {

    //method to check if arrays are equal
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }

        //compare every element of each array
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    //if not the same return false
                    return false; 
                }
            }
        }
        //if the same return true
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //create arrays
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        
        //get values for array 1
        System.out.print("Enter m1 (a 3 by 3 matrix) row by row: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = input.nextInt();
            }
        }

        //get values for arra 2
        System.out.print("Enter m2 (a 3 by 3 matrix) row by row: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = input.nextInt(); 
            }
        }

        //check if it returned true or false and output results
        if (equals(m1, m2)) {
            System.out.println("The two matrices are identical.");
        } else {
            System.out.println("The two matrices are not identical.");
        }
        input.close();
    }
}
