import java.util.Arrays;
class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int count = 0;
        int timePassing = 0;
        double[] factor = new double[dist.length];
        for (int index = 0; index < dist.length; index++) {
            factor[index] = ((double) dist[index]) / ((double) speed[index]);
        }
        Arrays.sort(factor);
        for (int index = 0; index < dist.length; index++) {
            if (factor[index] - timePassing <= 0) {
                return count;
            } else {
                count++;
            }
            timePassing++;
        }
        return count;
    }
}