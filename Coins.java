import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<Integer> MinimumCoins(int n) {
        // Write your code here.
        List<Integer> result = new ArrayList<>();
        int[] coins = {1000,500,100,50,20,10,5,2,1};
        for(int coin:coins){
            while(n>=coin){
                result.add(coin);
                n = n-coin;
            }
        }
        return result;
    }
}
