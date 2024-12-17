class Solution {
    public int lengthOfLongestSubstring(String s) {
        int aux, longest = 0;
        Set<Character> characters = new HashSet();
        char[] string = s.toCharArray();
        char current;
        for (int i = 0; i < string.length; i++){
            current = string[i];
            aux = i;
            while(!characters.contains(current)&& i < string.length){
                characters.add(current);
                if (characters.size() > longest){
                    longest = characters.size();
                }
                i++;
                if (i < string.length) {
                    current = string[i];
                }
            }
            i = aux;
            characters.clear();
        }
        return longest;
    }
}
