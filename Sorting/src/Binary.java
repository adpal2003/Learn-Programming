public class Binary {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,7,8,9};
        int li=nums[0];
        int hi = nums.length-1;
       int mid = (li+hi)/2;
       int target=10;
       while(li<=hi){
           if(nums[mid] == target){
               System.out.println(nums[mid]+" Target is found index "+ mid);
               break;
           }
           else if(nums[mid]<target){
               li = mid +1;
           }
           else {
               hi = mid -1;

           }
           mid = (li+hi)/2;
       }
       if(li>=hi){
           System.out.println("element is no found ");
       }

    }
}
