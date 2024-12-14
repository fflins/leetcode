class Solution {
    public boolean isPalindrome(int x) {
        String num = new String(String.valueOf(x));
        String pal = "";
        char carac; 
        for (int i = num.length()-1; i>=0; i--){
            carac = num.charAt(i);
            pal += carac;
        }
        if (pal.equals(num)) return true;
        else return false;
    }
}