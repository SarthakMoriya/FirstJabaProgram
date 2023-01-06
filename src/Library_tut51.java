import java.util.Scanner;

class Library {
    String[] availBooks = {"BookA", "BookB", "BookC", "BookD", "BookE", "BookF"};
    int[] availBooksQ = {5, 5, 5, 5, 5, 5};
    String[] issuedBooks = {"0", "0", "0", "0", "0", "0"};
    int j = 0;


    public void issueBook(String name) {
        boolean issued = false;
        for (int i = 0; i < availBooks.length; i++) {

            if (availBooks[i].equals(name)) {
                if (availBooksQ[i] != 0) {
                    System.out.println("Book Issued::" + availBooks[i]);
                    availBooksQ[i]--;
                    issuedBooks[j++] = availBooks[i];
                    issued = true;
                } else {
                    System.out.println("The book required by you is out of stock!");
                }
            }
        }

        if (!issued) System.out.println("Please enter a valid book");
    }

    public void returnBook(String name) {
        for (int i = 0; i < issuedBooks.length; i++) {

            if (issuedBooks[i].equals(name)) {

                System.out.println("Thanks for returning");
                for (int k = 0; k < availBooks.length; k++) {
                    //Making the quantity back by increasing the number of that
                    //book
                    if (availBooks[i] == name) {
                        availBooksQ[i]++;

                        //If quantity become same as initially we remove the
                        // book from issued books array
                        if (availBooksQ[i] == 5)  issuedBooks[i] = " ";
                    }
                }
            }
        }

    }

    public void displayBooks() {
        for (int z = 0; z < availBooks.length; z++) {
//            System.out.print(v + "    ");
            System.out.print(availBooks[z] + "    ");
        }

    }

    public void displayQ() {
        for (int k = 0; k < availBooksQ.length; k++) {
            System.out.print(availBooksQ[k] + "        ");
        }
    }

    public void displayIssuedBooks() {
        for (String v : issuedBooks) {
            System.out.print(v + "    ");
        }
    }
}

public class Library_tut51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------WELCOME TO OUR LIBRARY------------------- ");
        Library l = new Library();
        System.out.println("-------------------Available Books------------------- ");
        l.displayBooks();
        System.out.println();
        System.out.println("-------------------Available Quantity------------------- ");
        l.displayQ();
        System.out.println();
        System.out.println("-------------------Issued Books------------------- ");
        l.displayIssuedBooks();

        System.out.println("SELECT OPTION");
        System.out.println("1)ISSUE BOOK 2)RETURN BOOK  3)SHOW BOOKS  4)EXIT");
        int opt=sc.nextInt();

        switch(opt){
            case 1:
                System.out.print("Please enter the book you wanna issue today Sir : ");
                String bookName = sc.nextLine();
                l.issueBook((String) bookName);
                break;

            case 2:
                System.out.print("Enter the book you wanna return : ");
                String rBook = sc.nextLine();
                l.returnBook((String) rBook);

            case 3:
                l.displayBooks();
                l.displayQ();

            default:
                System.out.println("Thanks for visiting!");
        }

    }
}
