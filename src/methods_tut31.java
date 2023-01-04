public class methods_tut31 {

    static void logic(int x,int y){
        int z=x+y;
        System.out.format("Sum of %d + %d :: %d",x,y,z);
        System.out.println();
    }

    void printing(){
        System.out.println("Hello WOrld");
    }

    static void foo(){
        System.out.println("Hello world");
    }
    static void foo(int x ,int y){
        System.out.println("Hello world"+x+y);
    }
    static void foo(int x){
        System.out.println("Hello world"+x);
    }

//    static  int sumN(int ...arr){
//     Available as int[] arr;
//        int sum=0;
//        for (int v:arr) {
//            sum+=v;}
//
//        return sum;
//    }
    static  int sumN(int a,int ...arr){
//        Available as int[] arr;
        int sum=0;
        for (int v:arr) {
            sum+=v;}

        return sum;
    }

    static int fact(int n){
        if(n<=1) return 1;

        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int x=4;
        int y=5;
        logic(x,y);

        methods_tut31 obj1=new methods_tut31();
        obj1.printing();

        //Method Overloading
        foo(1);
        foo();
        foo(1,4);

        //Variable args same as python
        System.out.println("Sum of 1,2,3,4,5,6,7,8 is : "+sumN(1,2,3,4,5,6,7,8));
        System.out.println("Sum of 1,2,3,4,5,6 is : "+sumN(1,2,3,4,5,6));

        //Recursion
        System.out.println("Factorial of 5 is : "+fact(5));
    }
}
