
class Circle {
    public void display() {
        System.out.println("Im Cirlce class");
    }

    public double area(double  r){
        return Math.PI*r*r;
    }

    public double perimeter(double r){
        return Math.PI*r*2;
    }
}

class Cyclinder extends Circle {
    public void displayCyc() {
        System.out.println("Im Cyclinder class");
    }
}

public class Inheritance_tut52 {
    public static void main(String[] args) {
        Cyclinder cyc = new Cyclinder();
        cyc.displayCyc();
        cyc.display();

        double area=cyc.area(12.0);
        double peri=cyc.perimeter(12.0);
        System.out.println(area);
        System.out.println(peri);
    }
}
