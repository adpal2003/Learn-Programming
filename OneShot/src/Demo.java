public class Demo {
   public void run(){
       System.out.println("runnning");
    }
    public  void eat(){
        System.out.println("eayt");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Demo demo = new Demo();
        demo.run();
        demo.eat();
    }
}
