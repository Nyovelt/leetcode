/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ret = new HashSet<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int target = -nums[i]-nums[j];
                int idx = Arrays.binarySearch(nums, j+1, nums.length, target);
                if (idx >= 0){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[idx]);
                    ret.add(tmp);
                }
            }
        }
        List<List<Integer>> ret2 = new ArrayList<>(ret);
        return ret2;
    }
}
// @lc code=end

