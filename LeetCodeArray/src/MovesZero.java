import java.util.Arrays;

public class MovesZero {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap elements
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;

                // Move the nonZeroIndex pointer forward
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        MovesZero movesZero = new MovesZero();
        int[] nums = {0, 1, 0, 3, 12};
        movesZero.moveZeroes(nums);

        // Print the array to verify the result
        System.out.println(Arrays.toString(nums)); // Expected output: [1, 3, 12, 0, 0]
    }
}
