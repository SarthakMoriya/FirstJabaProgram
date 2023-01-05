class A {
    public void meth1() {
        System.out.println("Im am method1 of Base class A");
    }

    public void meth2() {
        System.out.println("Im am method2 of Base class A with less features");
    }
}

class B extends A {
    @Override
    public void meth1() {
        System.out.println("Im am method1 of Derived class B");
    }
    @Override
    public void meth2() {
        System.out.println("Im method 2 of B class with better features");
    }
}

public class MethodOverriding_tut48 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.meth1();
        a1.meth2();

        B b1 = new B();
        b1.meth1();
        b1.meth2();
    }
}
