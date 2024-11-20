class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String ns = "";

        for (int i = 0; i < s.length(); i++) {
            ns = s.charAt(i) + ns;
        }

        System.out.println(ns);

        if(ns.equals(s)){
            return(true);
        }
        else{
            return(false);
        }
    }
}
