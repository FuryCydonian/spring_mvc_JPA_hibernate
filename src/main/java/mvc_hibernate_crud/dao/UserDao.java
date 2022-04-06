package mvc_hibernate_crud.dao;

import mvc_hibernate_crud.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
}
