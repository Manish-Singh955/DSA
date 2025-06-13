public class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Position to place the next non-zero number

        // First pass: Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Second pass: Fill remaining positions with zeros
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
