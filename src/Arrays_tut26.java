public class Arrays_tut26 {
    public static void main(String[] args) {
        //int[]  marks=new int[5];
        //int[] marks; //Declaration
        //marks=new int[5]; //Memory allocation
        int[] marks={10,20,30,40,50}; //Declaration + Memory Allocation


//        marks[1]=20;
//        marks[2]=30;
//        marks[3]=40;
//        marks[4]=50;
//        System.out.println(marks[0]);

        //Length Function
        System.out.println("Length of Marks array:"+marks.length);


//        DISPLAYING MARKS USING FOR LOOP
        System.out.println("Marks of Students");
        for (int i=0;i<marks.length;i++)
            System.out.print(marks[i]+" ");

        System.out.println();
        System.out.println("Printing in reverse order");
        for (int i= marks.length-1;i>=0;i--)
            System.out.print(marks[i]+" ");
        System.out.println();

//        ADVANCED VERSION OF FOR LOOP
        for (int var:marks) {
            System.out.println("MARKS::"+var);
        }

//        MultiDimensional Arrays
        String[][] flats;
        flats=new String[2][3];

        flats[0][0]="Sarthak";
        flats[0][1]="Muskaan";
        flats[0][2]="Parents";

        flats[1][0]="RNo:101";
        flats[1][1]="RNo:102";
        flats[1][2]="RNo:103";

        for (int i=0;i< flats.length;i++)
        {
            for (int j=0;j< flats[i].length;j++)
            {
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }
    }
}
