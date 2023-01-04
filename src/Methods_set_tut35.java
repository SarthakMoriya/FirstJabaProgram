import java.util.Scanner;

public class Methods_set_tut35 {

    static void multiply(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d",n,i,n*i);
            System.out.println();
        }
    }

    static void pattern(){
        for(int i=0;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static int sumN(int n){
        if(n==0) return 0;
        return n+sumN(n-1);
    }

    static void pattern2(){
        for(int i=5;i>=0;i--){
            for (int j=i;j>=0;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        //Multiplication Table
        System.out.print("Enter the number:: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        multiply(n);

        //Pattern
        pattern();

        //Recursive to calculate sum n natural number
        System.out.print("Enter Number till you want Sum::");
        int n1=sc.nextInt();
        System.out.println("Sum of "+n1+" numbers is::"+sumN(n1));

        //Pattern 2
        pattern2();

        //Fibonacci
        System.out.print("Enter nth fibonacci number you want::");
        int n2=sc.nextInt();
        System.out.println("Answer::"+fibo(n2));
    }
}
