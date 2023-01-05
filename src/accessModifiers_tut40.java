class MyEmployee {
    private int id;
    private int sal;
    private String sex;
    private String martialStatus;
    private String name;

    public MyEmployee() {
        this.sex = "Male";
        this.martialStatus = "Single";
        this.sal=10000;
    }
    public MyEmployee(int salary,String sexSt,String marry) {
        this.sex = sexSt;
        this.sal=salary;
        this.martialStatus =marry;
    }

    public void setId(int i) {
//        id=i;
        this.id = i;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void displayInfo() {
        System.out.println("Name::" + this.name);
        System.out.println("Id::" + this.id);
        System.out.println("Salary::" + this.sal);
        System.out.println("Sex::" + this.sex);
        System.out.println("Married::" + this.martialStatus);
    }
}

public class accessModifiers_tut40 {
    public static void main(String[] args) {
        MyEmployee e1 = new MyEmployee();
        e1.setId(1);
        e1.setName("Sarthak");
        e1.displayInfo();

        //Employee 2
        MyEmployee e2 = new MyEmployee(12344,"Male","Twice");
        e2.setId(2);
        e2.setName("Sarthak Daddy");
        e2.displayInfo();
    }
}
