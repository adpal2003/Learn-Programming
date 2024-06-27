public class OOPS{
    public static void main(String[] args){
        AddTwo ad = new AddTwo();
        System.out.print(ad.addition(1 ,2));
    }
}

class AddTwo{

public int addition(int a, int b){
   return a+b;
}
}