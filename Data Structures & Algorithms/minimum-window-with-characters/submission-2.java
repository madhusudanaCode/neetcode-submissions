class Solution {
    public String minWindow(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int minstart=0;

        for(int i=0;i<t.length();i++){
            mapT[t.charAt(i)-'A']++;
        }
        for(int right=0;right<s.length();right++){
            mapS[s.charAt(right)-'A']++;
                               while(ifMapSContainsFrequencyOfValuesinMapTAtMost(mapS,mapT)){
                int windowlen=right-left+1;
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    minstart=left;

                }
                
                mapS[s.charAt(left++)-'A']--;
            }


        }
                    return minlen==Integer.MAX_VALUE?"":s.substring(minstart,minlen+minstart);

    }





        public boolean ifMapSContainsFrequencyOfValuesinMapTAtMost(int[] mapS,int[] mapT){
            for(int i=0;i<256;i++){
                if(mapT[i]>mapS[i]){
                    return false;
                }
            }
                            return true;

        }
        

        
    }
