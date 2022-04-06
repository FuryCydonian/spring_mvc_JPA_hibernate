package mvc_hibernate_crud.service;

import mvc_hibernate_crud.dao.UserDao;
import mvc_hibernate_crud.dao.UserDaoImpl;
import mvc_hibernate_crud.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
