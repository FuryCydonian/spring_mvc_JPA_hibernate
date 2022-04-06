package mvc_hibernate_crud.controller;

import mvc_hibernate_crud.model.User;
import mvc_hibernate_crud.service.UserService;
import mvc_hibernate_crud.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private UserService userService = new UserServiceImpl();

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAllAttributes(users);
        return "users";
    }
}
