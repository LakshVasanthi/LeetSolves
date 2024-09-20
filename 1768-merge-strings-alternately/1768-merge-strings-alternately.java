class Solution {
    public String mergeAlternately(String word1, String word2) {
        int val=Math.min(word1.length(),word2.length());
        String res="";
        for(int i=0;i<val;i++){
            res=res+word1.charAt(i)+word2.charAt(i);
        }
        if(res.length()==(word1.length()+word2.length())) return res;
        else{
            String sub="";
            if(word1.length()>word2.length()) res=res+word1.substring(val,word1.length());
            else res=res+word2.substring(val,word2.length());
            return res;
        }
    }
}