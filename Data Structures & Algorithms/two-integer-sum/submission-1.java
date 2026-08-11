class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int size=nums.length;
        int complement=0;
        for(int i =0;i<size;i++){
            complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
}
