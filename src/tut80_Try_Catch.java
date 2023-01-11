public class tut80_Try_Catch {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try{
            int c=a/b;
            System.out.println("A/B = "+c);
        }catch (Exception e){
            System.out.println("Error:: "+e.getMessage());
        }
        System.out.println("Program Finished");
    }
}
