import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wqlin on 17-12-5 20:43.
 */
public class No15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0)
                break;
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int lo = i + 1, hi = length - 1, target = -nums[i];
            while (lo < hi) {
                int sum = nums[lo] + nums[hi];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                    while (lo < hi && nums[lo] == nums[lo - 1]) lo += 1;
                    while (lo < hi && nums[hi] == nums[hi + 1]) hi -= 1;
                } else if (sum < target) lo += 1;
                else hi -= 1;
            }
        }
        return res;
    }
}
