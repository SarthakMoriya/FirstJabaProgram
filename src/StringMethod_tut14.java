
public class StringMethod_tut14 {
    public static void main(String[] args) {
        String s="My name is SARthak";

        //Length
        int length=s.length();
        System.out.println("Length of S::"+length);

        //toUpperCase
        String upperS=s.toUpperCase();
        System.out.println("UpperCase S::"+upperS);

        //toLowerCase
        String lowerS=s.toLowerCase();
        System.out.println("UpperCase S::"+lowerS);

        //Trim
        String trimmedS=s.trim();
        System.out.println("Trimmed::"+trimmedS);

        //SubString(int start)
        String sub1=s.substring(2);
        System.out.println("SubString::"+sub1);

        //SubString(int start)
        String sub2=s.substring(2,7);
        System.out.println("SubString::"+sub2);

        //Replace
        System.out.println(s.replace('R','p'));
        String newS = s.replace("SAR","HAR");
        System.out.println("NEW::"+newS);

        //endsWith(),startsWith()
        System.out.println(s.endsWith("ak"));
        System.out.println(s.startsWith("My"));
    }
}
