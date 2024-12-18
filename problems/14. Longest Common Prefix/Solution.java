class Solution {
    public String longestCommonPrefix(String[] strs) {
        int numStrings = strs.length;
        if (numStrings == 1) return strs[0];
        char[] first = strs[0].toCharArray();
        List<Character> builder = new ArrayList<>();
        for ( char c : first){
            builder.add(c);
        }

        for (int i = 1; i< strs.length; i++){
            for (int j = 0; j< strs[i].length() && j < builder.size(); j++){
               if (strs[i].charAt(j) != builder.get(j)) {
                    builder.subList(j, builder.size()).clear();
                    break;
                }

            }

            if (strs[i].length() < builder.size()) {
                builder.subList(strs[i].length(), builder.size()).clear();
            }

        }

        if (builder.isEmpty()) return "";


        StringBuilder result = new StringBuilder();
        for (char c: builder){
            result.append(c);
        }
        return result.toString();  
    }
}
