package com.pb.fedosova.hw8;


public class Auth {
    static String login;
    private static String password;

    public void signUp(String loginNew, String passwordNew, String confirmPasswordNew)
            throws WrongLoginException,
            WrongPasswordException {

        String patLogin = "([a-zA-Z0-9]{5,20})";
        String patPassword = "([a-zA-Z_0-9]{5,})";

        if (loginNew.matches(patLogin)) {
            login = loginNew;
        } else {
            throw new WrongLoginException("Вы ввели неверный логин. Попробуйте заново");
        }

        if (passwordNew.matches(patPassword) && passwordNew.equals(confirmPasswordNew)) {
            password = passwordNew;
            System.out.println("Регистрация успешно завершена!");
        } else {
            throw new WrongPasswordException("Ваш пароль не соответствует требованиям. Попробуйте снова");
        }
    }

    public void signIn(String loginNew, String passwordNew) throws WrongLoginException {
        if (loginNew.equals(login) & passwordNew.equals(password)) {
            System.out.println("Авторизация прошла успешно!");
        } else {
            throw new WrongLoginException("Вы ввели неверный логин. Попробуйте снова");
        }
    }
}