import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] mat) {
        int maxr=mat.length-1;
        int maxc=mat[0].length-1;
        int minr=0,minc=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(minr<=maxr && minc<=maxc){
            for(int i=minc;i<=maxc;i++) 
                ans.add(mat[minr][i]);
                minr++;
            if(minr>maxr) break;
            for(int i=minr;i<=maxr;i++) 
                ans.add(mat[i][maxc]);
                maxc--;
            if(minc>maxc) break;
            for(int i=maxc;i>=minc;i--) 
                ans.add(mat[maxr][i]);
                maxr--;
            if(minr>maxr) break;
            for(int i=maxr;i>=minr;i--) 
                ans.add(mat[i][minc]);
                minc++;
             if(minc>maxc) break;
        }
        return ans;
    }
    public static void main(String[] args) {
    int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    List<Integer> ans=spiralOrder(mat);
    for(int ele:ans) System.out.print(ele + " ");
}
}
