package com.ray.service;

import com.ray.model.User;

import java.util.ArrayList;

/**
 * Created by RayYu on 2016/11/16.
 */
public interface TestService {
    ArrayList<User> getAllUsers ();
    User getUser(Integer id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Integer id);

}
