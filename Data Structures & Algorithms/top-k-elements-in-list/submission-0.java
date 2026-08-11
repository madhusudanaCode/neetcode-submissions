class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> elementFrequencyMap = new HashMap<>();
      List<Integer>[] frequencyElementsBucketList = new List[nums.length +1];

      for(int n : nums){
elementFrequencyMap.put(n,elementFrequencyMap.getOrDefault(n,0)+1);
      }

      for(int key : elementFrequencyMap.keySet()){
        int frequency = elementFrequencyMap.get(key);
        if(frequencyElementsBucketList[frequency]==null){
            frequencyElementsBucketList[frequency]=new ArrayList<>();
        }
        frequencyElementsBucketList[frequency].add(key);
      }

      int res[] = new int[k];
      int counter=0;
      for(int pos=frequencyElementsBucketList.length-1;pos>=0 && counter<k;pos--)
      {
        if(frequencyElementsBucketList[pos]!=null){
            for(Integer integer:frequencyElementsBucketList[pos]){
                res[counter++]=integer;
            }
        }
      }
      return res;

    }
}
