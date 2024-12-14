
    class Solution {
        public static int lengthOfLastWord(String s) {
            int i = s.length() -1;
            int cnt = 0;
            char[] string = s.toCharArray();
            while(string[i] == ' ') i--;
            while(string[i] != ' ' && i>=0){
                cnt++;
                if (!(i==0)) i--;
                else break;
            }
            
            return cnt;
        }
    }