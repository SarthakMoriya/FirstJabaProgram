import java.util.Scanner;
public class operators_tut9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


//        (x-y)/2
        int x,y,result;
        System.out.println("Enter x,y:");
        x=sc.nextInt();
        y=sc.nextInt();
        result=(x-y)/2;

//        b*b-4ac / 2a
        int a,b,c,d;
        System.out.println("Enter a,b,c::");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        d=(((b*b)-(4*a*c))/(2*a));

//        v*v-u*u
        int v,u,res;
        System.out.println("Enter v,u::");
        v=sc.nextInt();
        u= sc.nextInt();
        res=v*v-u*u;

        System.out.println("Result1:"+result);
        System.out.println("Result2:"+d);
        System.out.println("Result3:"+res);
    }
}
