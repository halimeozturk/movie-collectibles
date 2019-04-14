package com.movie.Controller;


import com.movie.Model.User;
import com.movie.Service.UserService;
import com.movie.helper.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/users")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public User addUser(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public Response deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return new Response("200", "", "");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/login")
    public User login(@RequestBody User user){
        System.out.println(user.getEmail() + " " + user.getPassword());
        User user2 = userService.loginUser(user.getEmail(), user.getPassword());
        return user2;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable String id){
        return userService.getUser(id);
    }

    @PutMapping("/user/{id}")
    public void updateUser(@PathVariable String id, @RequestBody User user) {
        userService.updateUser(id, user.getUsername());
    }


}
