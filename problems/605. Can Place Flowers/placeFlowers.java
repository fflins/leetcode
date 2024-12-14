class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int num = 0;
        for(int j = 0;j<=flowerbed.length-1;j++){
            if(flowerbed.length==1&&flowerbed[j]==0)num++; 

            if(j == 0){
                if(flowerbed[j] == 0 && flowerbed.length>1 && flowerbed[j+1] == 0){
                    flowerbed[j] = 1;
                    num++;
                }
            } 
            else if(j == flowerbed.length - 1){
                if(flowerbed[j] == 0 && flowerbed[j-1] == 0){
                    flowerbed[j] = 1;
                    num++;
                }
            }
            else {
                if(flowerbed[j-1] == 0 && flowerbed[j] == 0 && flowerbed[j+1] == 0){
                    flowerbed[j] = 1;
                    num++;
                }
            }
        }
        return num>=n;
    }
}


    


