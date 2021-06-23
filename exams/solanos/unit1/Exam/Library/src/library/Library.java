/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;


/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String title, author;
        int instances;

        // the book1 object is created using the constructor with parameters
        Book book1 = new Book ("Don Quixote", "Cervantes", 1, 0);
        // the book2 object is created using the default constructor
        Book book2 = new Book ();

        System.out.print ("Enter title:");
        title = sc.nextLine ();
        System.out.print ("Enter author:");
        author = sc.nextLine ();
        System.out.print ("Number of copies:");
        instances = sc.nextInt ();

        // The data requested by keyboard is assigned to book2.
        // for this the setters methods are used
        book2.setTitulo (title);
        book2.setAutor (author);
        book2.setEjemplares (copies);

        // the data of the book1 object is displayed on the screen
        // getters methods are used to access the value of the attributes
        System.out.println ("Book 1:");
        System.out.println ("Title:" + book1.getTitle ());
        System.out.println ("Author:" + book1.getAutor ());
        System.out.println ("Items:" + book1.getExamples ());
        System.out.println ("Borrowed:" + book1.get Borrowed ());
        System.out.println ();

        // a book1 loan is made. The method returns true if it could
        // make the loan and false otherwise
        if (book1.loan ()) {
            System.out.println ("The book has been checked out" + book1.getTitle ());
        } else {
            System.out.println ("There are no copies of the book" + book1.getTitle () + "to lend");
        }

        // a return of book1 is performed. The method returns true if it could
        // return and false otherwise
        if (book1.devolution ()) {
            System.out.println ("The book has been returned" + book1.getTitle ());
        } else {
            System.out.println ("There are no copies of the book" + book1.getTitle () + "borrowed");
        }

        // another book loan1 is made
        if (book1.loan ()) {
            System.out.println ("The book has been checked out" + book1.getTitle ());
        } else {
            System.out.println ("There are no copies of the book" + book1.getTitle () + "to lend");
        }

        // another book loan1 is made. In this case it will not be possible since
        // There is only one copy of this book and it is already on loan. It will be displayed by
        // display the message There are no copies of the book ...
        if (book1.loan ()) {
            System.out.println ("The book has been checked out" + book1.getTitle ());
        } else {
            System.out.println ("There are no copies of the book" + book1.getTitle () + "to lend");
        }
        // display the data of the book1 object
        System.out.println ("Book 1:");
        System.out.println ("Title:" + book1.getTitle ());
        System.out.println ("Author:" + book1.getAutor ());
        System.out.println ("Items:" + book1.getExamples ());
        System.out.println ("Borrowed:" + book1.get Borrowed ());
        System.out.println ();

        System.out.println ("Book 2:");
        System.out.println ("Title:" + book2.getTitle ());
        System.out.println ("Author:" + book2.getAutor ());
        System.out.println ("Items:" + book2.getExamples ());
        System.out.println ("Borrowed:" + book2.get Borrowed ());
        System.out.println ();
    }
        
