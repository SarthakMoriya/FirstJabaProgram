import java.util.Scanner;

public class tut81_Try_Catch_Multiple {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        int[] arr={1,2,3,4,5};

        try {

            int c = a / b;
            System.out.println("A/B = " + c);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Array Index::");
            int ind=sc.nextInt();
            System.out.println("Element at entered Index:: "+arr[ind]);
        } catch (ArithmeticException e) {
            System.out.println("Some Arithmetic Error Occurred!");
            System.out.println("Error:: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please Enter A Valid Index Next Time!");
            System.out.println("Error:: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some Error Occurred!");
            System.out.println("Error:: " + e.getMessage());
        }
        System.out.println("Program Finished");
    }
}
