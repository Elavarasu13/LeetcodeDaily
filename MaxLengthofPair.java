class Solution {
    public int findLongestChain(int[][] pairs)
     {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int i = 0, res = 0;
        while (i < pairs.length) {
            res++;
            int curEnd = pairs[i][1];
            while (i + 1 < pairs.length && pairs[i + 1][0] <= curEnd) i++;
            i++;
        }
        return res;
    }
}