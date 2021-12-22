package com.pb.fedosova.hw12;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {

        User user1 = new com.pb.fedosova.hw11.User("Руслан", LocalDate.of(1989, 01, 10), "+380984657895", "Харьков");
        User user2 = new com.pb.fedosova.hw11.User("Алиса", LocalDate.of(1987, 04, 19), "+380634769852", "Днепр");
        User user3 = new com.pb.fedosova.hw11.User("Аврора", LocalDate.of(1998, 09, 06), "+380509786143", "Суммы");
        User user4 = new com.pb.fedosova.hw11.User("Сергей", LocalDate.of(1988, 12, 11), "+380684120895", "Чернигов");
        User.showAll();

        System.out.println("Удалить пользователя: ");
        User.removeUser(user2);
        User.showAll();

        System.out.println("Добавить пользователя: ");
        User.getUser(2);

        System.out.println("Сортировать 1-по адресу, 2-по имени: ");
        User.compare(2);
        User.showAll();

        System.out.println("Изменить пользователя: ");
        User.setUser(0, new com.pb.fedosova.hw11.User("Карина", LocalDate.of(1986, 06, 05), "+380678725874", "Херсон"));
        User.showAll();

        System.out.println("Записать в файл: ");
        User.toFile();
        System.out.println("Запись из файла: ");
        User.fromFile(User.toFile());
    }
}
