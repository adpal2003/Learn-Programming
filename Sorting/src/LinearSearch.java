public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 6, 1, 7, 8};
        int target = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(nums[i] + " is found at index" + i);
                temp = temp + 1;
            }
        }
        if(temp==0){
            System.out.println("not found");
        }
    }
}