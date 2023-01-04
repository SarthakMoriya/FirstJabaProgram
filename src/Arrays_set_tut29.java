import java.util.Scanner;

public class Arrays_set_tut29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //1)Create Float arrays and calculate sum
        System.out.print("Enter Total number of Elements:: ");
        int n=sc.nextInt();
        int[] arr1 = new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            System.out.print("Enter Element: ");
            arr1[i]= sc.nextInt();
            sum+=arr1[i];
        }
        for (int v:arr1)
            System.out.print(v+" ");
        System.out.println();

        System.out.println("Sum::"+sum);

        //2) Linear Search
        System.out.println("Enter the element you want to search:: ");
        int item= sc.nextInt();
        int flag=0;
        for (int var:arr1) {
            if(var==item)
            {
                flag=1;
                break;
            }
        }
        if(flag==1) System.out.println("Item Present");
        else System.out.println("Item not present");

        //3)AVERAGE MARKS
        System.out.println();
        System.out.println();
        int[] marks={20,46,97,45,78,54,79,89};
        int sumMarks=0;
        for(int v:marks){
            sumMarks+=v;
        }
        System.out.println("DISPLAYING MARKS OF STUDENTS");
        for(int m:marks)
            System.out.print(m+" ");
        System.out.println();

        System.out.println("Average Marks::"+sumMarks/marks.length);

        System.out.println();
        System.out.println();

        //4)MATRIX ADDITION
        int[][] m1={{1,2},{3,4},{5,6}};
        int[][] m2={{1,2},{3,4},{5,6}};
        int[][] m3=new int[3][2];

        for (int i=0;i< m1.length;i++){
            for (int j=0;j<m1[i].length;j++){
                m3[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("MATRIX1 + MARIX2 ::");
        for(int i=0;i< m3.length;i++){
            for (int j=0;j<m3[i].length;j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }

        //5)REVERSE AN ARRAY
        int[] a1={1,2,3,4,5,6};
        int i=0;
        int j=a1.length-1;
        System.out.println("-------BEFORE REVERSING-----");
        for (int v:a1) {
            System.out.print(v+" ");
        }
        System.out.println();
        while(i<=j){
            int temp=a1[i];
            a1[i]=a1[j];
            a1[j]=temp;
            i++;j--;
        }
        System.out.println("------AFTER REVERSING-------");
        for (int v:a1){
            System.out.print(v+" ");
        }
        System.out.println();

        //MAXIMUM & MINIMUM IN ARRAY
        int maxx=marks[0];
        int minn=marks[0];
        for(int m:marks){
            if(m>maxx) maxx=m;
            if(m<minn) minn=m;
        }
        System.out.println("MAXIMUM MARKS SCORED == "+maxx);
        System.out.println("MINIMUM MARKS SCORED == "+minn);

        //8)SORTED OR NOT ?
        int[] arr3={1,2,3,4,8,7,6,5,0};
        boolean sorted=true;
        for (int g =0;g< arr3.length;g++){
            if(arr3[g]>arr3[g+1]) {
                sorted=false;
                break;}
        }
        if(sorted) System.out.println("Sorted Array");
        else System.out.println("Unsorted Array");
    }
}
