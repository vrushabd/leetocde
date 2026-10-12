class Solution {
    public int maxSum(List<Integer> nums, int k) {
           int[] bits = new int[32];

        for (int num : nums) {
            for (int j = 0; j < 32; j++) {
                if ((num & (1 << j)) != 0) {
                    bits[j]++;
                }
            }
        }

        long ans = 0;

        for (int i = 0; i < k; i++) {
            long num = 0;

            for (int j = 0; j < 32; j++) {
                if (bits[j] > 0) {
                    num |= (1L << j);
                    bits[j]--;
                }
            }

            ans = (ans + num * num) % 1_000_000_007;
        }

        return (int)ans;
    }
}