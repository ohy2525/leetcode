class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length == 1) return new int[]{0};
        int[] answer = new int[temperatures.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        pq.add(new int[]{temperatures[0], 0});

        for (int i = 1; i < temperatures.length; i++) {
            while (pq.size() > 0 && pq.peek()[0] < temperatures[i]) {
                int[] tmp = pq.poll();
                answer[tmp[1]] = i - tmp[1];
            }
            pq.add(new int[]{temperatures[i], i});
        }
        
        while (pq.size() > 0) {
            int[] tmp = pq.poll();
            answer[tmp[1]] = 0;
        }

        return answer;
    }
}