class Solution {
    public boolean checkInclusion(String s1, String s2) {

int s1len=s1.length();
        int s2len=s2.length();
        if (s2len < s1len) {
            return false;
        }
        int[] s1array= new int[26];
        int[] s2array=new int[26];
        
        

        for(int i=0;i<s1.length();i++){
            s1array[s1.charAt(i)-'a']++;
            s2array[s2.charAt(i)-'a']++;
        }

        for(int i=s1len;i<s2len;i++){
            if(Arrays.equals(s1array,s2array)){
                return true;
            }
            s2array[s2.charAt(i-s1len)-'a']--;
            s2array[s2.charAt(i)-'a']++;
            
        }
        if(Arrays.equals(s1array,s2array)){
                return true;
        }
        return false;

        

}
}
