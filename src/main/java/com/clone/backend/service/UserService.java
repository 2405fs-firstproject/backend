package com.clone.backend.service;
import com.clone.backend.model.User;
import java.util.List;
public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUser();
}
