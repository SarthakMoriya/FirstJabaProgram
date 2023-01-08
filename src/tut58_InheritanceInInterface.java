interface sampleInterface{
    void meth1();
    void meth2();
}

interface childInterface extends sampleInterface{
    void meth3();
}

class SampleClass implements  childInterface{
    public void meth1(){
        System.out.println("Im method 1");
    }
    public void meth2(){
        System.out.println("Im method 2");
    }
    public void meth3(){
        System.out.println("Im method 3");
    }
}

public class tut58_InheritanceInInterface {
    public static void main(String[] args) {
        SampleClass c=new SampleClass();
        c.meth1();
        c.meth2();
        c.meth3();
    }
}
