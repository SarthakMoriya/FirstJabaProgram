import java.util.Scanner;

class MyRadiusException extends Exception{
    public String getMessage(){
        return "Please Enter Positive Radius!";
    }
}
public class tut84_Throw_Throws {
    static double area(int r) throws MyRadiusException{
        if(r<0) throw  new MyRadiusException();
        return Math.PI * r * r;
    }

    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int c = divide(4, 1);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Radius:: ");
            int radius = sc.nextInt();
            System.out.println("Area == " + area(radius));
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            int b=0;
            int a=3;

            if(b==0){
                throw  new Exception("Cannot divide by ZERO!");
            }else{
                System.out.println("A/B:"+a/b);
            }
        }catch(Exception e){
            System.out.println(e);
//            System.out.println(e.getClass());
//            System.out.println(e.getCause());
        }
    }
}
