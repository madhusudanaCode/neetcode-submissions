class Solution {
    public int characterReplacement(String s, int k) {
        int[] freqMap =new int[26];
        int maxfreq=0;
        int maxwin =0;
        int left=0;
        for(int right=0;right<s.length();right++){
            freqMap[s.charAt(right)-'A']++;
            maxfreq = Math.max(maxfreq,freqMap[s.charAt(right)-'A']);
            int windowlen=right-left+1;
            if(windowlen-maxfreq>k){
                freqMap[s.charAt(left)-'A']--;
                left++;

            }
            windowlen=right-left+1;
            maxwin=Math.max(windowlen,maxwin);
        }
        return maxwin;


    }
        
}
