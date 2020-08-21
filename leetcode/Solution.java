class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum = sum + Math.abs(nums[i]);
        }
        int count[] = new int[2*sum+1];
        int ans = 0;
        count[sum]++;
        int pref = 0;
        for(int i = 0;i < nums.length;i++){
            pref = pref+nums[i];
            if(sum+pref-k >= 0){
                ans = ans+count[sum+pref-k];
            }
            count[sum+pref]++;
        }
        return ans;
        
    }
}
