class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int arr[] = new int[nums.length];
        int j = 0;
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[j];
            arr[i+1] = nums[n];
            i++;
            n++;
            j++;
        }

        return arr;

    }
}