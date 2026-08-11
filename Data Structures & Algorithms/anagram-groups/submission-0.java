class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s : strs){
            char[] strChar = s.toCharArray();
            Arrays.sort(strChar);
            String sortedS = new String(strChar);
            map.putIfAbsent(sortedS,new ArrayList<>());
            map.get(sortedS).add(s);

        }
        return new ArrayList<>(map.values());
       

        
    }
}
