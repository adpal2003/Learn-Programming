import java.util.HashSet;

public class DuplicateUnsortedArray {
    public static void main(String[] args) {
        int[] nums ={10,9,8,7,6};
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            hs.add(nums[i]);

        }
        for(int no:hs){

            System.out.print(no);

        }
    }

}
