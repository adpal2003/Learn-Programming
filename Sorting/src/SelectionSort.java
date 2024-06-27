public class SelectionSort{

    public static void main(String[]args){
        int min, temp=0;
        int[] nums= {38,52,9,18,6,62,13};

        for(int i=0; i<nums.length; i++){
            min=i;

            for(int j=i+1; j<nums.length; j++){

                if(nums[j]<nums[min]){

                    min = j;



                }



            }

            temp=nums[i];
            nums[i] = nums[min];
            nums[min]=temp;


        }

        for(int i=0; i<nums.length; i++){

            System.out.print(nums[i] + " ");

        }


    }

}