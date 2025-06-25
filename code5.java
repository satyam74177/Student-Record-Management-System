import java.util.*;
public class code5 {
    public static void main(String[] args) {
        // To add 2d Matrix
        int[][] mat1 = {{2,4,5},
                        {3,4,5}};
        int[][] mat2 = {{4,3,5},
                        {6,7,8}};
        int[][] result = new int [2][3];
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                result[i][j] = mat1[i][j]+mat2[i][j];
                
            }
        }
         for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(result[i][j]+" ");
                
            }
            System.out.println();
           
        }
    }
}
