class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        ans[0] = findPosition(nums, target, true);
    
        if (ans[0] != -1) {
            ans[1] = findPosition(nums, target, false);
        }
        
        return ans;
    }
    private int findPosition(int[] nums, int target, boolean findFirst) {
        int left = 0;
        int right = nums.length - 1;
        int pos = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                pos = mid;
                if (findFirst) {
                    right = mid - 1; 
                } else {
                    left = mid + 1;  
                }
            }
        }
        
        return pos;
    }
}
