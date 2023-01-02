import java.util.Scanner;

public class ifElse_tut16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Gaadi chala le bhainchoo Aarsh" );
        }else{
            System.out.println("Datt Madarchod");
        }

        if(age>18 || age==18){
            System.out.println("Chala le bhai dhyaan se");
        } else if (age<10 && age>5) {
            System.out.println("Datt bc piche bhaith");
        }else{
            System.out.println("Gaddi tera bhai chalayega");
        }
    }
}
