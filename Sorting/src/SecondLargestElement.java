import java.util.Arrays;
import java.util.*;


public class SecondLargestElement {
    public static void main(String[] args) {

//        first approch.........
//        int[] nums = {6, 11, 2, 4, 3, 21, 5, 7,9};
//
//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i]< nums[j]){
//                    int temp = nums[j];
//                    nums[j]= nums[i];
//                    nums[i]= temp;
//                }
//            }
//        }
////        for(int i=0; i<nums.length; i++){
////            System.out.print(nums[i]+" ");
////        }
//        System.out.println("Second largest element is "+nums[1]);

//        Second Aproch.......

        int[] nums = {6, 11, 2, 4, 3, 5, 7,9};

        int largest = Integer.MIN_VALUE;
        int Second_Largest = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                Second_Largest = largest;
                largest = nums[i];

            }
            else if(nums[i]>Second_Largest && nums[i]!=largest){
                Second_Largest = nums[i];
            }
        }
        System.out.println(Second_Largest+" Second Largest element");



    }
}
