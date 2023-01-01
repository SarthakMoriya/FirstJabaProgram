import java.util.Scanner;

public class practiseSet2_tut12 {
    public static void main(String[] args) {
        //float a=7/4*9/2 =?
        float a=7/4f*9/2f;
        //=1.75*9/2
        //=15.75/2
        //=7.425
        System.out.println(a);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Grade");
        char eGrade='A';
        System.out.println("Decrypted Grade::"+eGrade);
        System.out.println("Encrypted Grade::"+ (char)(69));
        int v=10,u=5,A=3,s=2;
        int res=v*v-u*u/(2*A*s);
        System.out.println(res);

        int x=7;
        int z=(7*49 + 35/7);
    }
}
