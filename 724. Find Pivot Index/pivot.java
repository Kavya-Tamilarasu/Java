class Solution {
    public int pivotIndex(int[] nums) {
        int tot=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(left==tot-left-nums[i]){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}