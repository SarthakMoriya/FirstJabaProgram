import java.awt.*;
import java.util.Scanner;

class Employee{
    int sal;
    String name;

    public int getSalary(){
        return sal;
    }

    public void setName(String Name){
        name=Name;
    }

    public String getName(){
        return name;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }    public void switchedOff(){
        System.out.println("Switched Off!");
    }
}

class Square{
    int side;

    public void setSide(int s){
        side=s;
    }

    public int getPerimeter(){
        return  4*side;
    }

    public int getArea() {
        return side*side;
    }
}
class Rectangle{
    int len;
    int brd;

    public void setSide(int l,int b){
        len=l; brd=b;
    }

    public int getPerimeter(){
        return  2*(len+brd);
    }

    public int getArea() {
        return len*brd;
    }
}
public class Oops_st_tut39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //EMPLOYEE CLASS
        Employee e1=new Employee();
        System.out.println("enter Salary of Employee");
        e1.sal=sc.nextInt();

        e1.setName("SARTHAK");
        System.out.println("Name of E1::"+e1.getName());
        System.out.println("Salary of E1::"+e1.getSalary());

        //CELLPHONE CLASS
        CellPhone c1=new CellPhone();
        c1.ring();
        c1.switchedOff();
        c1.vibrate();


        //SQUARE CLASS
        Square s1=new Square();
        s1.setSide(5);
        System.out.println("AREA::"+s1.getArea());
        System.out.println("PERIMETER::"+s1.getPerimeter());

        //RECTANGLE CLASS
        Rectangle r1=new Rectangle();
        r1.setSide(5,6);
        System.out.println("AREA::"+r1.getArea());
        System.out.println("PERIMETER::"+r1.getPerimeter());
    }
}
