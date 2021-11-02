package com.pb.fedosova.hw5;

    public class Book {
        private String bookTitle;
        private String bookAuthor;
        private int bookYear;

        public Book(String bookTitle, String bookAuthor, int bookYear) {
            this.bookTitle = bookTitle;
            this.bookAuthor = bookAuthor;
            this.bookYear = bookYear;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public String getBookAuthor() {
            String bookAuthor = this.bookAuthor;
            return bookAuthor;
        }

        public int getBookYear() {
            return bookYear;
        }

        public String getBookInfo() {
            return "Название: " + bookTitle + ", Автор: " + bookAuthor + ", Год издания: "
                    + bookYear;
        }
    }
