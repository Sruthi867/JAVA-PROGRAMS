package com.examly;

public class Encapculation {
    public static void main(String[] args){
        Book b=new Book();
        b.bookid(101);
        b.bookname="Book abc";
        b.bookprice=456.89;
        System.out.println(b);
        
    }
}
class Book{
     int bookid;
    String bookname;
    double bookprice;
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public double getBookprice() {
        return bookprice;
    }
    public void setBookprice(double bookprice) {
        this.bookprice = bookprice;
    }
    public int getBookid(){
        return bookid;
    }
    public void setBookId(int bookid){
        this.bookid=bookid;
    }
    public String getBookname(){
        return bookname;
    }


    }
