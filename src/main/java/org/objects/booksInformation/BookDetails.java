package org.objects.booksInformation;

import java.util.Scanner;

public class BookDetails {
    private String bookTitle;
    private String author;
    private String bookPublisher;
    private int numberOfCopy;

    public BookDetails(String bookTitle,String author,String bookPublisher,int numberOfCopy){
        this.bookTitle=bookTitle;
        this.author=author;
        this.bookPublisher=bookPublisher;
        this.numberOfCopy=numberOfCopy;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }


    public String getBookPublisherName() {
        return bookPublisher;
    }


    public int getNumberOfCopy() {
        return numberOfCopy;
    }


    public void getBookDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BookName : ");
        bookTitle = sc.nextLine();

        System.out.println("Enter Book AuthorName : ");
        author = sc.nextLine();

        System.out.println("Enter Book PublisherName : ");
        bookPublisher = sc.nextLine();

        System.out.println("Enter  Numbers of Available Books :  ");
        numberOfCopy = sc.nextInt();
    }

    public void purchase(String bookName, String authorName, int numberOfcopy, String publisher) {
        if (bookTitle.equals(bookName) && author.equals(authorName) &&
                bookPublisher.equals(publisher) )
             {
            if (this.numberOfCopy > numberOfcopy) {
                System.out.println("The Book is Available !! You can purchase...");
                this.numberOfCopy -= numberOfcopy;
                System.out.println("After purchasing the Update StockBook are : " + numberOfCopy);
            } else
                System.out.println("No such Name book found.!!");


        }else
            System.out.println("No such Element found");
    }}