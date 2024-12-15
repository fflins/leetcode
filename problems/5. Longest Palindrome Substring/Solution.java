class Solution {
    public String longestPalindrome(String s) {
        int auxI;
        int auxJ;
        String longestSubStr = " ";
        String currentSubStr;
        for (int i = 0; i< s.length(); i++){
            for (int j = s.length() - 1; j > i; j--){
                auxI = i;
                auxJ = j;
                 while (auxI <= auxJ && s.charAt(auxI) == s.charAt(auxJ)) {
                    auxI++;
                    auxJ--;
                }

                if(auxI > auxJ) {
                    currentSubStr= s.substring(i,j +1 );
                    if (longestSubStr.length() < currentSubStr.length()) longestSubStr = currentSubStr;
                }                   
            }
        }
        return longestSubStr;
    }
}
    




