import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random randomNum=new Random();
        int pc= randomNum.nextInt(1,4);
        int i=0;
        int myScore=0,pcScore=0;
        Scanner sc=new Scanner(System.in);

        while(i<5) {
            System.out.print("Enter Rock->1 Paper->2 Scissors->3 ::");
            int me=sc.nextInt();
            if (me == pc) {
                System.out.println("Draw");
            } else if (me == 1 && pc == 2) {
                System.out.println("PC Wins!");
                pcScore++;
            } else if (me == 1 && pc == 3) {
                System.out.println("You Win!");
                myScore++;
            } else if (me == 2 && pc == 1) {
                System.out.println("You Win!");
                myScore++;
            } else if (me == 2 && pc == 3) {
                System.out.println("Pc Wins!");
                pcScore++;
            } else if (me == 3 && pc == 1) {
                System.out.println("Pc Wins!");
                pcScore++;
            } else if (me == 3 && pc == 2) {
                System.out.println("You Win!");
                myScore++;
            }else{
                System.out.println("Enter between 1-3 only");
                i=i-2;
            }

            if (pc == 1) System.out.println("PC choose Rock");
            else if (pc == 2) System.out.println("PC choose Paper");
            else System.out.println("PC choose Scissors");

            i++;
        }

        System.out.println("PC Scores::"+pcScore);
        System.out.println("Your Scores::"+myScore);

        if(pcScore>myScore)System.out.println("PC Wins");
        else if (pcScore==myScore) System.out.println("Draw");
        else System.out.println("You Win");

    }
}
