class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        //convert integer to string
        String s=String.valueOf(x); 
        //use two pointers to check for palindrome
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
    return true;
}
}