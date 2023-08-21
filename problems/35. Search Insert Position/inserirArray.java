class Solution {
    public int searchInsert(int[] nums, int target) {   
        int esq = 0;
        int dir = nums.length - 1;
        
        while (esq <= dir) {
            int meio = esq + (dir - esq) / 2;
            if (nums[meio] == target) return meio;
            else if (nums[meio] < target) esq = meio + 1;
            else dir = meio - 1;
        }
        return esq;
        }             
    }