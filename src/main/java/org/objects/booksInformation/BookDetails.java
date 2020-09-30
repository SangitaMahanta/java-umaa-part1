package org.objects.booksInformation;

import java.util.Scanner;

public class BookDetails {
    private String bookTitle;
    private String author;
    private String bookPublisherName;
    private int numberOfCopy;

//    public String getBookTitle() {
//        return bookTitle;
//    }
//
//    public void setBookTitle(String bookTitle) {
//        this.bookTitle = bookTitle;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getBookPublisherName() {
//        return bookPublisherName;
//    }
//
//    public void setBookPublisherName(String bookPublisherName) {
//        this.bookPublisherName = bookPublisherName;
//    }
//
//    public int getNumberOfCopy() {
//        return numberOfCopy;
//    }
//
//    public void setNumberOfCopy(int numberOfCopy) {
//        this.numberOfCopy = numberOfCopy;
//    }

    public void getBookDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BookName : ");
        bookTitle = sc.nextLine();

        System.out.println("Enter Book AuthorName : ");
        author = sc.nextLine();

        System.out.println("Enter Book PublisherName : ");
        bookPublisherName = sc.nextLine();

        System.out.println("Enter  Numbers of Available Books :  ");
        numberOfCopy = sc.nextInt();
    }

    public void purchase(String bookName, String authorName, int numberOfcopy, String publisherName) {
        if (bookTitle.equals(bookName) && author.equals(authorName) &&
                bookPublisherName.equals(publisherName) &&
                this.numberOfCopy == numberOfcopy) {
            if (this.numberOfCopy > numberOfcopy) {
                System.out.println("The Book is Available !! You can purchase...");
                this.numberOfCopy -= numberOfcopy;
                System.out.println("After purchasing the Update StockBook are : " + numberOfCopy);
            } else
                System.out.println("No such Name book found.!!");


        }else
            System.out.println("No such Element found");
    }}