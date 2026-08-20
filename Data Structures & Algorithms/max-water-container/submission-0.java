class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        if(n==0){
            return 0;
        }
        int maxarea=0;
        int left=0;
        int right=n-1;
        while(left<right){
            int width = right-left;
            int height = Math.min(heights[left],heights[right]);
            maxarea= Math.max(maxarea,width*height);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
        
    
    
    }
}
