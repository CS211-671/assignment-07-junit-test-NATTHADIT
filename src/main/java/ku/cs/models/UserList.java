package ku.cs.models;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users;

    public UserList() {
        users = new ArrayList<>();
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.isUsername(username)) {
                return user;
            }
        }
        return null;
    }

    public void addUser(String username, String password) {
        User exist = findUserByUsername(username);
        if (exist == null) {
            users.add(new User(username, password));
        }
    }


    public boolean changePassword(String username, String oldPassword, String newPassword) {
        User u = findUserByUsername(username);
        if (u == null){
            return false;
        }
        else {

            if (oldPassword.equals(newPassword)) {
                return false;
            } else {
                u.setPassword(newPassword);
                return true;
            }
        }
    }


    public User login(String username, String password) {
        User u = findUserByUsername(username);
        if (u == null){
            return null;
        }
        else{
            if (u.validatePassword(password)){
                return u;
            }
            else {
                return null;
            }
        }
    }
}