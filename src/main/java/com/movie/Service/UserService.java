package com.movie.Service;

import com.movie.Model.User;
import com.movie.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUser(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public void updateUser(String id, String username) {
        userRepository.setUserUpdate(id, username);

    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public User loginUser(String username,String password){
        return userRepository.findUser(username,password);
    }

}