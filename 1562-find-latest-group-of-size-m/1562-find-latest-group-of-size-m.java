class Solution {
    public int findLatestStep(int[] arr, int m) {
        int n = arr.length;
        int result = -1;

        int[] lenAtIndex = new int[n + 2];
        int[] countLen = new int[n + 2];

        for (int i = 0; i < n; i++) {
            int leftLen = lenAtIndex[arr[i] - 1];
            int rightLen = lenAtIndex[arr[i] + 1];

            int newLen = leftLen + rightLen + 1;

            lenAtIndex[arr[i]] = newLen;
            lenAtIndex[arr[i] - leftLen] = newLen;
            lenAtIndex[arr[i] + rightLen] = newLen;

            countLen[leftLen]--;
            countLen[rightLen]--;
            countLen[newLen]++;

            if (countLen[m] > 0) {
                result = i + 1;
            }
        }

        if (countLen[m] > 0) {
                result = i + 1;
        }

        return result;
    }
}