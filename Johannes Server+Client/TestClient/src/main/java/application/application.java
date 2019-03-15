package application;

import service.UserServiceImpl;

import entity.User;

public class application {

    public static void main(String[] args) {

        UserServiceImpl test = new UserServiceImpl();

        try {
            User test2 = new User();
            test2.setUser_name("sderefs");
            test2.setPassword("sdfsdf");
            test2.setVegetarian("1000");
            test2.setId(11);
            test.updateUser(test2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
