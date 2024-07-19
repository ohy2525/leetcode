class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(-num);
        }

        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                return -pq.poll();
            }
            pq.poll();
        }
        return -1;
    }
}