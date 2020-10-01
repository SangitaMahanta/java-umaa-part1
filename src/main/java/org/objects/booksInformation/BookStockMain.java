package org.objects.booksInformation;

public class BookStockMain {
    public static void main(String[] args) {
        BookDetails book=new BookDetails("Wings of fire","APJ Abdul Kalam", "DelhiPublication",25);
        System.out.println("Enter Book title is : "+book.getBookTitle());
        System.out.println("Enter Book Author is : "+book.getAuthor());
        System.out.println("Enter Book Publisher is : "+book.getBookPublisherName());
        System.out.println("Enter Book NumberOfCopies is : "+book.getNumberOfCopy());
        System.out.println();


        book.getBookDetails();
        book.purchase("wings of fire", "APJ Abdul Kalam",10,
                "universities press");
       book.purchase("Ignited Minds", "APJ Abdul Kalam",5,
                "Penguin");
        book.purchase("wings of fire", "APJ Abdul Kalam",20,
                "universities press");


    }
}
