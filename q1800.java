public class q1800 {
    public int maxAscendingSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max=nums[0],sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }
            else{
                max = Math.max(max, sum);
                sum = nums[i];
            }
        }
        return Math.max(max, sum);
    }
}
