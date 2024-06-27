public class PivotIndex {

    public int pivotind(int[] arr){
        int left_sum=0;
        int right_sum = sumOfArray(arr);
        for(int i=0; i<arr.length; i++){
        right_sum -=  arr[i];

        if(left_sum== right_sum){
            return i;
        }
        left_sum += arr[i];
        }
        return -1;
    }

    public int sumOfArray(int[] nums){
       int sum=0;
        for(int i=0; i<nums.length; i++){
           sum+= nums[i];
        }
        return sum;
    }


    public static void main(String[] args) {

        int[] array ={1,2,1,5,2,4};
        PivotIndex pi = new PivotIndex();
        int res = pi.pivotind(array);
        System.out.println(res);
    }
}
