import java.util.Scanner;

public class tut82_Nested_Try_Catch {
    public static void main(String[] args) {
        int[] arr = {23,56,54,89,90,60,78,97,99,100};
        Scanner sc = new Scanner(System.in);
        char opt = 'y';
        while (opt=='y' || opt=='Y') {
            try {
                System.out.print("Enter the RollNo of Student::");
                int ind = sc.nextInt();
                System.out.println("Marks are: " + arr[ind]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please Enter a valid Index");
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.print("Do you want to continue ? y or Y for Yes");
            opt = sc.next().charAt(0);
        }
    }
}
