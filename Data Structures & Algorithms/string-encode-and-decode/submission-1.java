class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(String str:strs){
            s.append(str.length()).append('#').append(str);
        }
        return s.toString();

    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j=len +i;
            list.add(str.substring(i,j));
            i=j;

        }
        return list;

    }
}
