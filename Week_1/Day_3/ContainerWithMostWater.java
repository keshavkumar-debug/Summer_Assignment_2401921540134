class ContainerWithMostWater{
    public static int maxArea(int[] height) {
        int right=0,left=height.length-1;
        int area=0;
        while(right<left){
            int a=height[right];
            int b=height[left];
            area=Math.max(area,((left-right)*Math.min(a,b)));
            if(height[left]<height[right]) left--;
            else right++;
        }
        return area;
}
 public static void main(String[] args) {
    int height[]={1,8,6,2,5,4,8,3,7};
    int maxArea=maxArea(height);
    System.out.println(maxArea);
 }
}