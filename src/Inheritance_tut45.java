class Base{
   protected int x;
    public void getX(){
        System.out.println("In Base class");
        System.out.println("X:"+ this.x );
    }

    public void setX(int x1){
        System.out.println("In base class");
        this.x=x1;
    }
}

class Dervied extends Base{
    int y;

    public void setY(int y) {
        this.y = y;
        System.out.println("In Dervied class");
    }

    public void getY(){
        System.out.println("In Derived class");
        System.out.println("Y::"+this.y);
    }
}

class Animal{
    int noOfLegs=4;

    public void group(){
        System.out.println("I am from animal group");
        System.out.println("I have "+this.noOfLegs+" legs");
    }
}

class Dog extends Animal{

}
public class Inheritance_tut45 {
    public static void main(String[] args) {
        Base b1=new Base();
        b1.setX(2);
        b1.getX();

        Dervied d1=new Dervied();
        d1.setY(3);
        d1.getY();

        d1.setX(4);
        d1.getX();

        d1.x=12;
        System.out.println(d1.x);

        Dog d=new Dog();

        d.group();
    }
}
