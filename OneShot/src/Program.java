
class Pen {
    String color;
    String Type;

    public void Write(){
        System.out.println("Write Something");

    }
    public void printColor(){
        System.out.println(this.color);
    }



}

class Student{
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.age);
        System.out.println(this.name);


    }
//    Student(){
//        System.out.println("constructer called");
//    }


    Student(String name, int age){
        this.name = name;
        this.age= age;



    }
}



public class Program {

   public static void main(String[]args){
//       Pen pen1 = new Pen();
//       pen1.color = "blue";
//       pen1.Type="gel";
//
//       Pen pen2 = new Pen();
//       pen2.color= "red";
//       pen2.Type="ball pen";
//
//       pen1.printColor();
//       pen2.printColor();
//
//
//       pen1.Write();

//       Student s1 = new Student();
//       s1.age=23;
//       s1.name="lala";
//
//       s1.studentInfo();

       Student s1 = new  Student("Adarsh", 24);
       s1.studentInfo();

   }

}
