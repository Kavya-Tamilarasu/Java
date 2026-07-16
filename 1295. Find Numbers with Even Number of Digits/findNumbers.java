import java.util.*;
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            int n=Integer.toString(num).length();
            if(n%2==0){
                count++;
            }
        }
        return count;
        
    }
}