class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0){
            return new int[0];
        }
        int res[]=new int[nums.length];
        int r=1;
        for(int i=0;i<nums.length;i++){
            res[i]=r;
            r=r*nums[i];
        }
        r=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]=res[i]*r;
            r=r*nums[i];
        }
        return res;
    }
}
