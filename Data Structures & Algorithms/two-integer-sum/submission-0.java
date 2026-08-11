class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size=nums.length;
        int pair[][] = new int[size][2];
        for(int i=0;i<size;i++){
            pair[i][0]=nums[i];
            pair[i][1]=i;
        }
        Arrays.sort(pair,(a,b)->Integer.compare(a[0],b[0]));
        int left=0;
        int right=pair.length - 1;
        while(left<right){
            int sum=pair[left][0]+pair[right][0];
            if(sum == target){
                return new int[]{Math.min(pair[left][1],pair[right][1]),Math.max(pair[left][1],pair[right][1])};
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[2];
    }
}
