package org.mercadolibre.service;

import org.mercadolibre.model.User;
import org.mercadolibre.repository.UserList;

public class CRUD extends UserList { ;

    public void createUser(String name, String password) {
        setUser(name, password);
        setUserList();
    }

    public void deleteUser(int num) {
        getUserList().remove(num);
    }

    public void viewUsers() {
        getUserList().forEach(user -> {
            System.out.print("ID: " + user.getId() + " ");
            System.out.print("Nombre: " + user.getUser() + " ");
            System.out.print("Password: " + user.getPassword() + " ");
        });
    }
}
