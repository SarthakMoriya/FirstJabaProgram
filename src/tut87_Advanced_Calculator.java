import java.util.Scanner;

public class tut87_Advanced_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {

                System.out.println("             ============WELCOME TO MY CALCULATOR============");
                System.out.print("   1)ADDITION");
                System.out.print("   2)SUBTRACTION");
                System.out.print("   3)MULTIPLICATION");
                System.out.print("   4)DIVISION");
                System.out.println("   5)EXIT");
                System.out.println("             ================================================");

                System.out.print("CHOOSE BETWEEN 1-5 :");
                int opt = sc.nextInt();

                if (opt >= 5) break;

                System.out.print("Enter Value of First Num:");
                int a = sc.nextInt();
                System.out.print("Enter Value of Second Num:");
                int b = sc.nextInt();

                if (a > 100000 || b > 100000) throw new Exception("Please Provide  Numbers Smaller Than 1,00,000");


                switch (opt) {
                    case 1:
                        System.out.println(a + " + " + b + " = " + (a + b));
                        break;
                    case 2:
                        System.out.println(a + " - " + b + " = " + (a - b));
                        break;
                    case 3:
                        if (a > 7000 || b > 7000) throw new Exception("Please provide numbers less than 7,000");
                        System.out.println(a + " X " + b + " = " + a * b);
                        break;
                    case 4:
                        if (b == 0) throw new ArithmeticException("Cannot Divide By Zero");
                        System.out.println(a + " / " + b + " = " + a + b);
                        break;
                    default:
//                        System.out.println("Thanks for using my Calculator");
                }
                System.out.println("Do you want ot continue ? Press y or y for Yes");
                char s = sc.next().charAt(0);
                boolean cond = (s == 'y' || s == 'Y');
                if (!cond) break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Do you want ot continue ? Press y or y for Yes");
                char s = sc.next().charAt(0);
                boolean cond = (s == 'y' || s == 'Y');
                if (!cond) break;
            } finally {
                System.out.println("Thanks for Using my Calculator!");
            }
        }
    }
}
