class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> mape = new HashMap<>();
        for(int i=0; i<n; i++){
            int nuu = target-nums[i];
            if(mape.containsKey(nuu)){
                return new int[] {mape.get (nuu),i};
            }
            mape.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}