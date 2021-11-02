package com.pb.fedosova.hw5;

public class Library {

    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В.В.");
        readers[1] = new Reader("Романов А.Л.");
        readers[2] = new Reader("Семенов Р.С.");

        Book[] book = new Book[3];
        book[0] = new Book("Приключения", "Иванов И.И.", 2000);
        book[1] = new Book("Словарь", "Сидоров А.В.", 1980);
        book[2] = new Book("Энциклопедия", "Гусев К.В.", 2010);
        String[] bookTitle = {"Приключения", "Словарь", "Энциклопедия"};

        System.out.println("Список книг: ");
        for (Book books : book) {
            System.out.println(books.getBookInfo());
        }
        System.out.println("");

        System.out.println("Список читателей: ");
        for (Reader reader : readers) {
            System.out.println(reader.readerName);
        }
        System.out.println("");

        readers[0].takeBook(3);
        System.out.println("");

        readers[1].takeBook(bookTitle);
        System.out.println("");

        readers[2].takeBook(book);
        System.out.println("");

        readers[0].returnBook(3);
        System.out.println("");

        readers[1].returnBook(bookTitle);
        System.out.println("");

        readers[2].returnBook(book);
    }
}

