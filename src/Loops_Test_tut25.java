import java.util.Scanner;

public class Loops_Test_tut25 {
    public static void main(String[] args) {
        //PRINTING PATTERNS
        int i=4;
        while(i>=1){
            int j=0;
            while(j<i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }

        //Sum of FIRST N NATURAL NUMBERS
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        int sum=0;

        for(int k=0;k<n;k++){
            sum+=k;
        }
        System.out.println("Sum of First "+n+" natural numbers:: "+sum);


        //Multiplication Table
        System.out.println("Enter The Number:: ");
        int m=sc.nextInt();
        int sumOfMultiples=0;
        for(int z=1;z<=10;z++){
            sumOfMultiples+=(m*z);
            System.out.println(m+" X "+z+" = "+m*z);
        }
        System.out.println("Sum of multiples::"+sumOfMultiples);

        //FACTORIAL
        System.out.print("Enter number whoose factorial you want ::");
        int factN=sc.nextInt();
        int fact=1;
        i=factN;
        while(i>=1){
            fact=fact*i;
            i--;
        }
        System.out.println("Factorial of "+factN+" is ::"+fact);
    }
}
