package mvc_hibernate_crud.dao;

import mvc_hibernate_crud.model.User;

import java.util.List;

public interface UserDao {
    public void createTable();

    List<User> getAllUsers();

    void addUser(User user);

    User readUser(long id);

    void updateUser(User user);

    void removeUser(long id);
}
