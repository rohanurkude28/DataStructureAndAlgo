package arrays.questions;

public class BestTimeToSellStock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minvalue = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(minvalue>prices[i]) minvalue = prices[i];
            else if(prices[i]-minvalue>maxProfit) maxProfit = prices[i]-minvalue;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
