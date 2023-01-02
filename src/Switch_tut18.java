import java.util.Scanner;

public class Switch_tut18 {
    public static void main(String[] args) {
        System.out.print("Enter Age and Name :");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String Name=sc.next();

        switch(age){
            case 18:
                System.out.println("You are a adult "+Name);
                break;
            case 23:
                System.out.println("Go find a job "+Name);
                break;
            case 28:
                System.out.println("Go find a chick "+Name);
                break;
            default:
                System.out.println("Enjoy boi");
        }
        System.out.println("Thanks for using Switch statement!");

        switch (age) {
            case 18 -> System.out.println("You are a adult " + Name);
            case 23 -> System.out.println("Go find a job " + Name);
            case 28 -> System.out.println("Go find a chick " + Name);
            default -> System.out.println("Enjoy boi");
        }
     }
}
