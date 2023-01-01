import java.util.Scanner;
public class tut6_Exercise {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks in 5 subjects");
        float sub1,sub2,sub3,sub4,sub5;
        System.out.println("Enter marks in Subject1:");
        sub1=sc.nextFloat();
        System.out.println("Enter marks in Subject2:");
        sub2=sc.nextFloat();
        System.out.println("Enter marks in Subject3:");
        sub3=sc.nextFloat();
        System.out.println("Enter marks in Subject4:");
        sub4=sc.nextFloat();
        System.out.println("Enter marks in Subject5:");
        sub5=sc.nextFloat();
        float sum=(((sub1+sub2+sub3+sub4+sub5)/500)*100);
        System.out.println("Average Marks:::"+sum);

    }
}
