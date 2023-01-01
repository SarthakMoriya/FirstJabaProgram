import java.util.Scanner;
public class tut5_input {
    public static void main(String[] args){
//        System.out.println("INPUT FROM USER");
//        System.out.println("Enter number1:");
        Scanner sc=new Scanner(System.in);
//        int n1=sc.nextInt();
//        System.out.println("Enter number2:");
//        int n2=sc.nextInt();
//        int sum=n1+n2;
//        System.out.println("Sum::" + sum);

        //Strings
        String s1=sc.next();
        //read only one word breaks after space
        String s2=sc.nextLine();
        System.out.println(s1);
        System.out.println(s2);
    }
}
