class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] strArray = s.toCharArray();
            Arrays.sort(strArray);
            String sortedStr = new String(strArray);
            map.putIfAbsent(sortedStr,new ArrayList<>());
            map.get(sortedStr).add(s);
    


        }
        return new ArrayList<>(map.values());
        
    }
}
