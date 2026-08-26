class Solution {
    public String minWindow(String s, String t) {
        int sFreqMap[] = new int[256];
        int tFreqMap[] = new int[256];

        int left=0;
        int right=0;
        int minLen = Integer.MAX_VALUE;
        int minstart=0;


        for(char c : t.toCharArray()){
            tFreqMap[c]++;
        }

        for(;right<s.length();right++){
            sFreqMap[s.charAt(right)]++;

            while(contains(sFreqMap,tFreqMap)){
                if(right-left+1 < minLen){
                    minLen=right-left+1;
                    minstart=left;
                }
                sFreqMap[s.charAt(left++)]--;
                }

        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minstart,minstart+minLen);
    }

        public boolean contains(int[] s, int[] t){
            for(int i=0;i<256;i++){
                if(t[i]>s[i]){
                    return false;
                }
            }
            return true;
        }

        
    }
