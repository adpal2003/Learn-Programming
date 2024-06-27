import java.util.*;
public class SumOf1Darray {
    public  int[]  sumOfarray(int[] nums){

        for(int i=1; i<nums.length; i++){
            nums[i]=nums[i] + nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4};
        SumOf1Darray sum = new SumOf1Darray();
        int[] res = sum.sumOfarray(array);
//       for(int i=0; i<res.length; i++){
//           System.out.print(res[i]);
           System.out.println(Arrays.toString(res));
//       }
    }
}
