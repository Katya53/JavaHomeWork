package com.pb.fedosova.hw5;

import java.util.Date;

public class Reader {
        public String readerName;
        private int cardNumber;
        private String faculty;
        public Date date;
        public int mobilePhone;

        public Reader(String readerFullName) {
            this.readerName = readerFullName;
        }

        public void takeBook(int count) {
            System.out.println(readerName + " взял " + count + " книги");
        }

        public void takeBook(String... bookTitles) {
            System.out.println(readerName + " взял книги:");
            for (String bookTitle : bookTitles) {
                System.out.println(bookTitle);
            }
        }

        public void takeBook(Book... books) {
            System.out.println(readerName + " взял книги:");
            for (Book book : books) {
                System.out.println(book.getBookInfo());
            }
        }

        public void returnBook(int count) {
            System.out.println(this.readerName + " вернул " + count + " книги");
        }

        public void returnBook(String... bookTitles) {
            System.out.println(readerName + " вернул книги:");
            for (String bookTitle : bookTitles) {
                System.out.println(bookTitle);
            }
        }

        public void returnBook(Book... books) {
            System.out.println(readerName + " вернул книги:");
            for (Book book : books) {
                System.out.println(book.getBookInfo());
            }
        }
    }
