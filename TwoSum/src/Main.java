import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(sol.twoSum(nums, target)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> preNum = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int targetNum = target - nums[i];
            if(preNum.containsKey(targetNum))
                return new int[] {preNum.get(targetNum), i};
            preNum.put(nums[i], i);
        }
        return new int[] {};
    }
}