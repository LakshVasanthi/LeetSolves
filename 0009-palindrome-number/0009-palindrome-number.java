class Solution {
    public boolean isPalindrome(int x) {
        String res="";
        String s=Integer.toString(x);
        for(int i=s.length()-1;i>=0;i--){
            res=res+s.charAt(i);
        }
        if(res.equals(s)) return true;
        else return false;
        //System.out.print("new string-->"+res);

    }
}