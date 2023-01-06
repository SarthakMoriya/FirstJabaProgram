abstract  class Parent2{
    public Parent2(){
        System.out.println("im parent class constructor");
    }

    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    //to make it concrete class we must create abstract method of it parent class
    // here else make it abstract by using abstract keyword

    public void greet(){
        System.out.println("Hello Good Morning");
    }
    public void greet2(){
        System.out.println("Hello Good Afternoon");
    }
}

//abstract  class Child3 extends Parent2{
  class Child3 extends Parent2{
    public void greet(){
        System.out.println("Hello Good Evening");
    }
    public void greet2(){
        System.out.println("Hello Good Night");
    }
}
public class Abstract_tut53 {
    public static void main(String[] args) {
        //Abstract class can be used to create other concrete classes from it by
        //inheriting them .We can create objects of abstract class

        Child2 c1=new Child2();
        c1.greet();
        c1.greet2();
        Child3 c3=new Child3();
        c3.greet();
        c3.greet2();
    }
}
