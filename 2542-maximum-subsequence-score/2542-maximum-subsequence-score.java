class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        long answer = 0;
        int n = nums1.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums2[i];
            arr[i][1] = nums1[i];
        }
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0;
        for (int[] nums : arr) {
            pq.add(nums[1]);
            sum += nums[1];
            if (pq.size() > k) sum -= pq.poll();
            if (pq.size() == k) answer = Math.max(answer, sum * nums[0]);
        }

        return answer;
    }
}