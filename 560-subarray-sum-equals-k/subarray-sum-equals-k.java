class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
          int c=0;
          for(int j=i;j<nums.length;j++)
          {
            c=c+nums[j];
            if(c==k){
                count++;
            }
          }
        }
        return count;
    }
}