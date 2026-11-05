class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] leftarray=new int[nums.length];
        int[] rightarray=new int[nums.length];
        leftarray[0]=1;
        for(int i=1;i<nums.length;i++){
            leftarray[i]=nums[i-1]*leftarray[i-1];
        }
        rightarray[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            rightarray[i]=nums[i+1]*rightarray[i+1];
        }
        for(int i=0;i<nums.length;i++){
            res[i]=leftarray[i]*rightarray[i];
        }

        return res;

        
    }

}  
