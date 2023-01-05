class Employee1 {
    int sal;
    int id;
    String name;

    public void info(){
        System.out.println("Name:"+name);
        System.out.println("Salary:"+sal);
    }

    public void displayId(){
        System.out.println("ID::"+id);
    }
}
public class OOPS_tut38 {
    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        Employee1 e2=new Employee1();
        e1.name="Sarthak Moriya";
        e2.name="Lakshmi Moriya";
        e1.sal=10000;
        e2.sal=100000;
        e1.id=1;
        e2.id=2;

        e1.info();
        e1.displayId();
        e2.info();
        e2.displayId();



    }
}
