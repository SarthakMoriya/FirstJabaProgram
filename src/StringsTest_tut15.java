import java.util.Scanner;

public class StringsTest_tut15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String::");
        String s=sc.nextLine();
        System.out.println("S in Lowercase::"+s.toLowerCase());

        //2
        System.out.println("Enter Name::");
        String name=sc.nextLine();
        System.out.println("Dear "+name+", Trains a lot");

        //3 replace spaces with underscores
        System.out.println("Enter String with spaces::");
        String spaceS=sc.nextLine();
        System.out.println(spaceS.replace(' ','_'));

        //5
        System.out.println("\"Dear Harry, This Java Course is nice.Thanks\"");
    }
}
