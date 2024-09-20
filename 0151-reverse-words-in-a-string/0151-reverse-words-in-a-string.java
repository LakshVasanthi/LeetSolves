class Solution {
    public String reverseWords(String s) {
        String orig=s.replaceAll("\\s+", " ");
        String[] words=orig.split(" ");
        String result="";
        for(int i=words.length-1;i>=0;i--){
            result+=words[i]+" ";
        }
        return result.trim();
    }
}