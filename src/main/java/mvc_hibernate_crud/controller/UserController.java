package mvc_hibernate_crud.controller;

import mvc_hibernate_crud.model.User;
import mvc_hibernate_crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getUsers(Model model) {
        userService.createTable();
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);

        return "users";
    }

    @GetMapping("/user-create")
    public String createUserForm(@ModelAttribute("user") User user) {
        return "user-create";
    }

    @PostMapping("/user-create")
    public String createUser(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("/users/{id}/edit")
    public String updateUserForm(@PathVariable("id") long id, @ModelAttribute("user") User user) {
        return "edit";
    }

    @PostMapping("/users/{id}/edit")
    public String updateUser(@PathVariable("id") long id, @ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/users";
    }

    @GetMapping("/users/{id}/delete")
    public String deleteUser(@PathVariable("id") long id) {
        userService.removeUser(id);
        return "redirect:/users";
    }
}
