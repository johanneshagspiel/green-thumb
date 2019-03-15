package application;

import service.UserServiceImpl;

import entity.User;

public class application {

    public static void main(String[] args) {

        UserServiceImpl test = new UserServiceImpl();

        try {
            test.getUser(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
