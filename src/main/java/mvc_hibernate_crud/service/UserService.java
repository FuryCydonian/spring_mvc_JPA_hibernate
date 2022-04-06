package mvc_hibernate_crud.service;

import mvc_hibernate_crud.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
}
