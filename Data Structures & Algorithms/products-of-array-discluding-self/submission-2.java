class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftarray=new int[nums.length];
        int[] rightarray = new int[nums.length];
        leftarray[0]=1;
        rightarray[nums.length-1]=1;
        int[] res=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            leftarray[i]=leftarray[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            rightarray[i]=rightarray[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            res[i]=leftarray[i]*rightarray[i];

        }
        return res;
        
    }

}  
