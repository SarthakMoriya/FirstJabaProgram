interface Bicycle {
    int speed=20;
    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface BlowHorn{
    void blowHorn1();
    void blowHorn2();
}
class Cycle implements Bicycle {

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brakes!");
        System.out.println("Speed:"+speed);
    }

    public void speedUp(int increment) {
        System.out.println("Accelerating!");
    }

    void blowHorn() {
        System.out.println("Pee Pee Poo Poo!");
    }
}

class AvonCycle implements Bicycle,BlowHorn{
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brakes!");
        System.out.println("Speed:"+speed);
    }

    public void speedUp(int increment) {
        System.out.println("Accelerating!");
    }

    public void blowHorn1(){
        System.out.println("Pichee Ho MC");
    }
    public void blowHorn2(){
        System.out.println("Side hoja MC");
    }

}
public class Interfaces_tut54 {
    public static void main(String[] args) {
        //In interfaces, we declare methods which needs to be implements
        // whoever implements the interface howe ver in abstract classes they
        // may include some other non-abstract methods
        Cycle c=new Cycle();
        c.applyBrake(34);
        //We can also create variables in Interfaces and use them,
        // but we cannot change them since they are final
        System.out.println(c.speed);


    }
}
