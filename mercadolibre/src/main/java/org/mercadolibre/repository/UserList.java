package org.mercadolibre.repository;
import org.mercadolibre.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserList{
    private List<User> userList = new ArrayList<User>();
    private User user = new User();

    public UserList(){
        setUser("Mauricio", "C0smopolis");
        setUserList();
        setUser("Juanito", "w34f32");
        setUserList();
        setUser("Ikal", "S3f3f");
        setUserList();
    }

    public void setUser(String name, String password){
        user.setId();
        user.setUser(name);
        user.setPassword(password);
    }

    public User getUser(){
        return user;
    }
    public void setUserList(){
        this.userList.add(getUser());
    }

    public List<User> getUserList(){
        return userList;
    }

}
