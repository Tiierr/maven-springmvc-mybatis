package com.ray.mapper;

import com.ray.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by RayYu on 2016/11/16.
 */
@Repository
public interface TestMapper {
    ArrayList<User> getAllUsers ();
}

