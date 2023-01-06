interface MyCamera {
    void takeSnap();

    void recordVideo();

    //Default Methods are used if we want ot declare methods later on in interface and instead of getting error in all the classes that hve inhertied the interface
    // we make such method a default method to reduce error we can simply call this
    // defaultmethod by object of class who inherits the interface  and can also redefine
    // it inside class

    default void record4kVideo(){
        System.out.println("Recording in 4K...");
    }
}

interface MyWifi {
    String[] getNetwork();

    void connectNetwork();
}

class MyCellPhone {
    void callNumber(int number) {
        System.out.println("Calling " + number);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
    @Override
    public void takeSnap() {
        System.out.println("Taking Picture!");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video!");
    }

    public void connectNetwork() {
        System.out.println("Connecting to NETPLUS");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("LOLO");
        String[] networks = {"NETPLUS", "AIRTEL", "JIO"};
        return networks;
    }
}

public class tut57_InterfaceInheritance {
    public static void main(String[] args) {
        MySmartPhone s= new MySmartPhone();
        s.takeSnap();
        s.record4kVideo();
        s.pickCall();
        s.connectNetwork();
    }
}
