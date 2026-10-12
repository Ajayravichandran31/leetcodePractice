public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max1 || nums[i] == max2 || nums[i] == max3) {
                continue;
            }
            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] > max3) {
                max3 = nums[i];
            }
        }
        
        if (max3 == Long.MIN_VALUE) {
            boolean hasMinInt = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == Long.MIN_VALUE) {
                    hasMinInt = true;
                    break;
                }
            }
            if (!hasMinInt) {
                return (int) max1;
            }
        }
        
        return (int) max3;
    }

    public static void main(String[] args) {
        ThirdMaximumNumber solution = new ThirdMaximumNumber();
        int[] nums = {3, 2, 1};
        int result = solution.thirdMax(nums);
        System.out.println(result);
    }
}