package ma_tran;

import java.util.*;

/**
 *
 * @author suckm
 */
public class Matrix {
    private int row,col,mat[][] = new int[51][51];

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public Matrix(int[][] mat,int col) {
        this.mat = mat;
        this.col = col;
    }
    public void nextMatrix(Scanner sc){
//        int mat[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        sc.nextLine();
    }
    
    public int[][] getMat() {
        return mat;
    }
    public Matrix trans() {
        int temp[][] = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                temp[j][i] = mat[i][j];
            }
        }
        return new Matrix(temp,row);
    }
    
    public String mul(Matrix b){
        int res[][] = new int[row][row];
        for(int[] row:res)
            Arrays.fill(row, 0);
        for(int i = 0;i<row;i++){
            for(int j = 0;j<row;j++){
                for(int k = 0;k<col;k++){
                    res[i][j] += mat[i][k] * b.getMat()[k][j];
                }
            }
        }
        String resString = "";
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                resString += res[i][j] + " ";
            }
            resString += "\n";
        }
        return resString;
    }
}
