class Solution {
    public int[] finalPrices(int[] prices) {
        int min = 0;
        for (int i = 0; i< prices.length; i++){
            if (i == prices.length -1){
                return prices;
            }

            for (int j = i + 1; j < prices.length; j++){
                if (prices[j]<= prices[i]){
                    min = prices[j];
                    break;
                }
            }
                prices[i] -= min;
                min = 0;        
            }
        return prices;  
    }
}
