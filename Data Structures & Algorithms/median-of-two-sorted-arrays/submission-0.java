class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mergedArray = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length ) {
            if (nums1[i] < nums2[j]) {
                mergedArray.add(nums1[i]);
                i++;
            }else {
                mergedArray.add(nums2[j]);
                j++;
            }
        }
        while (i < nums1.length ){
            mergedArray.add(nums1[i]);
            i++;
        }

        while (j < nums2.length ) {
            mergedArray.add(nums2[j]);
            j++;
        }

        if (mergedArray.size() % 2 == 0) {
            int first = mergedArray.get(mergedArray.size() / 2);
            int second  = mergedArray.get((mergedArray.size() / 2) - 1);
            return (first + second) / 2.0; 
        }else {
            return mergedArray.get(mergedArray.size() / 2);
        }
        
        
    }
}
