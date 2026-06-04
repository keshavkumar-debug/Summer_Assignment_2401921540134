class DiagonalSum{
    
    public static int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1) sum+=mat[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int mat[][]={{1,1,1,1},
              {1,1,1,1},
              {1,1,1,1},
              {1,1,1,1}};
        int diagSum=diagonalSum(mat);
        System.out.println("Diagonal SUm is :" + diagSum);
    }
}