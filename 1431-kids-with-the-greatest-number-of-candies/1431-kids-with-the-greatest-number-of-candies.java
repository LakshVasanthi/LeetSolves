class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> res = new ArrayList<>();
	    int c=0;
	    int max=max(candies);
        for(int i=0;i<candies.length;i++){
                c=candies[i]+extraCandies;
                //System.out.println("candy--"+candies[i]+"add candy--"+c);
                if(c>=max) res.add(true);
                else res.add(false);
        }
        return res; 
    }
    public static int max(int[] candies){
	    int max=candies[0];
	    for(int i=1;i<candies.length;i++){
	        if(max<candies[i]) max=candies[i];
	    }
	    return max;
	}
}