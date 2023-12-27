package org.example;

public class Mocking {

    User user;

    public void setUser(User user) {
        this.user = user;
    }

    //Lets write a method which assigns certain permissions
    public int assignPermissions(){
        if (user.getRole().equals("admin")) {
            String username = user.getUsername();
            System.out.println("Assign special permissions for user " + username);
            return 1;
        }else {
            System.out.println("Cannot assign permissions for user ");
            return -1;
        }
    }
}
