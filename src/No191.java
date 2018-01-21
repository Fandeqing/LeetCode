/**
 * Created by wqlin on 18-1-21 09:34.
 */
public class No191 {
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result += 1;
            n = n & (n - 1);
        }
        return result;
    }
}
