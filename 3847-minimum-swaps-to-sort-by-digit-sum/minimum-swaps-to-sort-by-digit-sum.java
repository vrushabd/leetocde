
import java.util.*;

class Solution {
    public int digitsum(int a) {
        int total = 0;

        while (a != 0) {
            total += a % 10;
            a /= 10;
        }

        return total;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][3];

        // Store: number, digit sum, original index
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = digitsum(nums[i]);
            arr[i][2] = i;
        }

        // Sort by digit sum, then by number
        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][2] == i) {
                continue;
            }

            int cycleLength = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][2];
                cycleLength++;
            }

            swaps += cycleLength - 1;
        }

        return swaps;
    }
}
