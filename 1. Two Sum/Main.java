
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int numToFind = target - nums[i];
			if (map.containsKey(numToFind))
				return new int[]{map.get(numToFind), i};
			else
				map.put(nums[i], i);
		}
		return new int[] {};
	}
}
