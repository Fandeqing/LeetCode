/**
 * Created by wqlin on 18-1-21 11:14.
 */
public class No338 {
    /**
     * Scala implementation will cause TLE
     */
    public int[] countBits(int num) {
        int[] results = new int[num + 1];
        results[0] = 0;
        int index = 1, segment = 1;
        while (index <= num) {
            for (int i = 0; i < Integer.min(segment, num + 1 - index); i++)
                results[index + i] = 1 + results[i];
            index += segment;
            segment <<= 1;
        }
        return results;
    }
}
