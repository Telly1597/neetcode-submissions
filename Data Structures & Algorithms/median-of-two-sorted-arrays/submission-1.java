class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int left = 0, right = nums1.length;
        while (left <= right ) {
            int mid = left + (right - left) / 2; 
            int nums2Cut = (nums1.length + nums2.length + 1) / 2 - mid; 

            int left1 = (mid > 0) ? nums1[mid - 1] : Integer.MIN_VALUE;
            int right1 = (mid < nums1.length ) ? nums1[mid] : Integer.MAX_VALUE;
            int left2 = (nums2Cut > 0) ? nums2[nums2Cut - 1] : Integer.MIN_VALUE;
            int right2 = (nums2Cut < nums2.length ) ? nums2[nums2Cut] : Integer.MAX_VALUE;

            if ( (left1 <= right2)  && (left2 <= right1 )) {
                /** MEDIAN VALUE FOUND:
                   - ODD: MAX left1 and left2 
                   - EVEN: average of the largest left boundary and smallest right boundary.   
                */
                
                /* EVEN OR ODD */ 
                if ((nums1.length + nums2.length) % 2 != 0) {
                    return Math.max(left1, left2);
                }else {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                }

            } else if (left1 > right2) {
                right = mid - 1;
            } else {
                left = mid + 1; 
            }

        }
        return -1;
    }
}
