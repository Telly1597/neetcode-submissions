class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (high + low ) / 2;

            // if target found// return index
            if (nums[mid] == target ) {
                return mid;
            }
            // if target is smaller, ignore right half;
            else if (nums[mid] > target) {
                high = mid - 1;
            } 
            // if target is bigger, ignore left half;
            else {
                low = mid + 1;
            }
        }
        return -1;
        
    }
}
