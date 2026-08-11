class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char charray[]=new char[26];
            charray=str.toCharArray();
            Arrays.sort(charray);
            String s = new String(charray);
            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}
