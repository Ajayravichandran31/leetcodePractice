class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int res=0;
        boolean ans=false;
        
        
        while(t>0){
            int k=t%10;
            res=res*10+k;
            t=t/10;
        }
        if(x==res){
            ans=true;
        }
        return ans;
    }
}