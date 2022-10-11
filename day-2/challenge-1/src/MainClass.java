public class MainClass {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] transpose = transposeMethod(matrix);
        displayMatrix(transpose);
    }

    public static int[][] transposeMethod(int[][] a){
        int[][] transposedMatrix = new int[3][3];
        int k=0;
        for(int i=0;i<3;i++){
            for(int j=2; j>=0;j--){
                //transposedMatrix[i][Math.abs(j-2)] = a[j][i];
                transposedMatrix[i][k] = a[j][i];
                k++;
            }
            k=0;
        }
        return transposedMatrix;
    }

    public static void displayMatrix(int[][] a){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
    }
}


