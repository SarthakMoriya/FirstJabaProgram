class Base1{
    Base1(){
        System.out.println("Im Base class constructor!");
    }

    Base1(int x){
        System.out.print("Im Base class constructor!");
        System.out.println(" X:"+x);
    }
}

class Derived1 extends  Base1{
    Derived1(){
//        super();
        System.out.println("Im Derived class constructor");
    }

    Derived1(int x,int y){
        super(x);
        System.out.println("Im Derived class constructor y:"+y);
    }

    public void display(){
        System.out.println("Displaying ....");
    }
    public void triggerDisplay(){
        this.display();
    }
}

class ChildOfDerived extends  Derived1{
    ChildOfDerived(int x , int y , int z){
        super(x,y);
        System.out.println("Im child of derived class ka constructor , Z:"+z);
    }
}
public class inheritance_tut46 {
    public static void main(String[] args) {
        Derived1 d =new Derived1();
//        Derived1 d1 =new Derived1(3,4);
//        ChildOfDerived c=new ChildOfDerived(1,2,3);
        d.triggerDisplay();
    }
}
