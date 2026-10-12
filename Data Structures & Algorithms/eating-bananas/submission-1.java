class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Only look for the range between 1 and max value.
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r) {
            int k = (r + l) / 2;
            int totalTime = 0;
            for (int pile: piles) {
                totalTime += Math.ceil((double) pile / k);
            }
            if (totalTime <= h) {
                res = k;
                r = k - 1;
            }else{
                l = k + 1;
            }
        }
        return res;

       
        

    }
}
