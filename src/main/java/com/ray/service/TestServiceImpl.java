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

    // 不应该继承
    public ArrayList<User> getAllUsers(){
        return testMapper.getAllUsers();
    }
}
