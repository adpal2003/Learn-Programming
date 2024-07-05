public class LinearSearchString {
    public static void main(String[] args) {
        String[] nums ={"Adarsh","muskan","mannish","Tinkesh","surj"};
        String Target = "Adarsh";
        int temp=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i].equals(Target)){
                System.out.println(nums[i]+"\n"+"Target is find index "  +  i);
                temp = temp+1;

            }
        }
        if(temp==0){
            System.out.println("not found");
        }
    }
}
