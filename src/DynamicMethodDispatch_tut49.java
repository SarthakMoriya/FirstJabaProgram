class Phone {
    public void display() {
        System.out.println("Phone display On!");
    }

    public void name() {
        System.out.println("im  Phone");
    }

    public void PhoneM(){
        System.out.println("In Phone class");
    }
}

class SmartPhone extends  Phone{
    public void display() {
        System.out.println("SmartPhone display On!");
    }

    public void testOverride(int x){
        System.out.println("Method of base");
    }

    public void name() {
        System.out.println("Im SMartPhone");
    }

    public void SmartPhoneM(){
        System.out.println("In smartPhone Class");
    }

    public void testOveride(){
        System.out.println("method of derived class");
    }
}

public class DynamicMethodDispatch_tut49 {
    public static void main(String[] args) {
//        Phone p = new Phone();
//        p.name();
//        p.display();

        SmartPhone s= new SmartPhone();
//        s.name();
//        s.display();
        s.testOverride(3);

        //Dynamic Method Dispatch
        Phone p1=new SmartPhone();
        p1.name();
//        p1.display();
        //here we have created object p1 of type Phone but from
        // bluePrint of SmartPhone , Here name and display will work for SmartPhone
        //parentClass name = new Childclass

        p1.PhoneM();
//        p1.SmartPhoneM();
    }
}
