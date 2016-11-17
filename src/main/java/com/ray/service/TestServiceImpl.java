package com.ray.service;

import com.ray.mapper.TestMapper;
import com.ray.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by RayYu on 2016/11/16.
 */
@Service
public class TestServiceImpl implements TestService{
    @Autowired
    private TestMapper testMapper;

    // 不应重载
    public ArrayList<User> getAllUsers(){

        return testMapper.getAllUsers();
    }

    public User getUser(Integer id){
        return testMapper.getUser(id);
    }

    public void addUser(User user){
        testMapper.addUser(user);
    }

    public void updateUser(User user){
        testMapper.updateUser(user);
    }

    public void deleteUser(Integer id){
        testMapper.deleteUser(id);
    }
}
