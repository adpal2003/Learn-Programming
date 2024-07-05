public class MinMaxArr {
    public static void main(String[] args) {
        int[] nums = {4,3,56,2,0,1,6,9};
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
           if(nums[i]> max){
               max = nums[i];

           }

        }
        System.out.println("max is "+ max);
    }
}

// min as same code condition will change