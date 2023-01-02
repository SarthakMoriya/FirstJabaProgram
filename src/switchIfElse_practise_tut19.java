import java.util.Scanner;

public class switchIfElse_practise_tut19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        System.out.println("Enter marks in 3 subjects::");
        float s1,s2,s3;
        s1=sc.nextFloat();
        s2=sc.nextFloat();
        s3=sc.nextFloat();

        float avg=(s1+s2+s3)/3.0f;

        if(avg<40){
            System.out.println("You failed Loser!");
        } else if (s1<33 || s2<33 || s3<33) {
            System.out.println("You failed in some subjects");
        }else{
            System.out.println("Average::"+avg);
            System.out.println("Party kha hai bhainchod");
        }
        */

        /*
        //3Income tax
        System.out.println("Enter you Income Range(anually)::");
        long  sal=sc.nextLong();

        if(sal>=250000 && sal<500000){
            System.out.println("Tax::"+sal*0.05f);
        }
        else if(sal>=500000 && sal<1000000){
            System.out.println("Tax::"+sal*0.2f);
        }
        else if(sal>1000000){
            System.out.println("Tax::"+sal*0.3f);
        }
        else{
            System.out.println("No tax");
        }

         */
        /*
        //Leap Year
        System.out.print("Enter Year:::");
        int year=sc.nextInt();

        if((year%4==0 || year%400==0) && year%100!=0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not Leap Year");
        }
        */

        //Check website
        System.out.print("Enter URL of Website:::");
        String url=sc.nextLine();

        if(url.endsWith(".com")){
            System.out.println("Commercial Webiste");
        }
        else if(url.endsWith(".org")){
            System.out.println("Organization Website");
        } else if (url.endsWith(".in")) {
            System.out.println("Indian Website");

        }
    }
}
