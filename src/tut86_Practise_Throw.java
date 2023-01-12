import java.security.InvalidParameterException;
import java.util.Scanner;

class MyTriesException extends Exception {
    public String getMessage() {
        return "ERROR!";
    }
}

public class tut86_Practise_Throw {

    static void question2() {
        int[] arr = {1, 2, 3, 4, 5};
        int wrgGuess = 0;
        Scanner sc = new Scanner(System.in);
        while (wrgGuess < 5) {
            try {
                System.out.println("Enter The Index:");
                int ind = sc.nextInt();
                System.out.println("Value at entered Index is :" + arr[ind]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
//                if (wrgGuess == 4) System.out.println("ERROR!");
                wrgGuess++;
            }
        }

        if (wrgGuess == 5) {
            try {
                throw new Exception("Error");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (wrgGuess == 5) {
            try {
                throw new MyTriesException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.print("Enter value of A & B: ");
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = a / b;
//        } catch (ArithmeticException e) {
//            System.out.println("HAHA");
//        } catch (InvalidParameterException e) {
//            System.out.println("HEHE");
//        }
        question2();

    }
}
