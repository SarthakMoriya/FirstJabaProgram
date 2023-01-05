import java.util.Random;
import java.util.Scanner;

class GuessMyNumber {
    private int count;
    private int randomNumber;

    public GuessMyNumber() {
        Random rNum = new Random();
        this.randomNumber = rNum.nextInt(100, 200);
        this.count = 1;
    }

    public void guess() {
        System.out.print("Enter a number between 100 to 200 : ");
        Scanner sc = new Scanner(System.in);
        int guessesNum = sc.nextInt();

        while (randomNumber != guessesNum) {
            if (guessesNum > randomNumber) {
                System.out.println("Enter Smaller Number");
                count++;
            } else if (guessesNum < randomNumber) {
                System.out.println("Enter Larger Number");
                count++;
            } else if (guessesNum == randomNumber) {
                count++;
                break;
            }

            System.out.print("Enter again::");
            guessesNum = sc.nextInt();
        }
        if (guessesNum == randomNumber) {
            System.out.println("You Won in " + count + " counts");
            System.out.println("The number was:" + guessesNum);

        }
    }

}

public class guessNumber {
    public static void main(String[] args) {
        GuessMyNumber obj1 = new GuessMyNumber();
        obj1.guess();

        System.out.println("Do you want to play again : Y for yes N for no ??");
        Scanner sc = new Scanner(System.in);
        char option = sc.next().charAt(0);

        while (option == 'y' || option == 'Y') {
            obj1.guess();
            System.out.println("Do you want to play again : Y for yes N for no ??");
            option = sc.next().charAt(0);
        }
    }
}
