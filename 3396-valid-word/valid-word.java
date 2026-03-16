class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3)
        {
            return false;
        }   
        boolean vowel=false;
        boolean consonant=false;
        for(char c:word.toCharArray())
        {
            if(!Character.isLetterOrDigit(c))
            {
                return false;
            }
            if(Character.isLetter(c))
            {
                char lower=Character.toLowerCase(c);
                if(lower=='a' || lower=='e'|| lower=='i' || lower=='o' || lower=='u')
                {
                    vowel=true;
                }
                else{
                    consonant=true;
                }
                
            }
        }
        return(vowel && consonant);
    }
}