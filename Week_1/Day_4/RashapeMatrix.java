public class RashapeMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if(n*m!=r*c) return mat;
        int x=0,y=0;
        int ans[][]=new int[r][c];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[x][y]=mat[i][j];
                 y++;
                if(y==c){
                    y=0;
                    x++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int mat[][]={{1,1,1,1},
              {1,1,1,1},
              {1,1,1,1},
              {1,1,1,1}};
        int r=2,c=8;
        int ans[][]=matrixReshape(mat, r, c);
        for (int i = 0; i < r; i++) {
            for(int j=0;j<c;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
