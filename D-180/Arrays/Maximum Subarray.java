class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum =0, max_sum=nums[0];
        
        for(int i=0;i<nums.length;i++){
            int value = nums[i];
            curr_sum += value;
            if(curr_sum<value)
                curr_sum = value;
            if(curr_sum>max_sum)
                max_sum = curr_sum;
            
        }
        
        return max_sum;
    }
}
