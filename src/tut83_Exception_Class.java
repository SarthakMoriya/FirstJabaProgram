import java.util.Scanner;

class MyException extends Exception{
    public String getMessage(){
        return "I am toString() Method";
    }

    public String toString(){
        return "Hello World";
    }
}
public class tut83_Exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ::");
        a=sc.nextInt();

        if(a<9){
            try{
                throw new MyException();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
    }
}
