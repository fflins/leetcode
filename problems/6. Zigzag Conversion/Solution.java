class Solution {
    public String convert(String s, int numRows) {
        Map< Integer, List<Character>> rows = new HashMap<>();
        int row = 0;
        int direction = 0; // 1 to go up 0 to go down

        if (numRows == 1 || s.length() == 1) return s;

        char[] string = s.toCharArray();


        for (int i = 0; i < numRows; i++) {
            rows.put(i, new ArrayList<>());
        }

        for (int i = 0; i < s.length(); i++){
            char letter = string[i];
            rows.get(row).add(letter);

            if (direction == 0){
                row++;
                if(row == (numRows-1)) direction = 1;

            } else {
                row--;
                if (row == 0) direction = 0;
            }
        }

        char[] result = new char[s.length()];
        int index=0;
        for (int i = 0; i < numRows; i++) {
            List<Character> rowList = rows.get(i);
            for (char c : rowList) {
                result[index++] = c; 
            }
        }

        return new String(result);
    }
}
