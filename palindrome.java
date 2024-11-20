class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);

        if((s.length()%2)==0){
            if(s.substring(0,s.length()/2)==s.substring(s.length()/2,s.length())){
                return(true);
            }
            else{
                return(false);
            }
        }
        else{
            if(s.substring(0,(s.length()/2)-1)==s.substring((s.length()/2+2),s.length())){
                return(true);
            }
            else{
                return(false);
            }
        }
    }
}
