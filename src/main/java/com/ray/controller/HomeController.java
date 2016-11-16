package com.ray.controller;

import com.ray.model.User;
import com.ray.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by RayYu on 2016/11/16.
 */

@Controller
public class HomeController {
    @Autowired
    private TestService service;
//
//    @Autowired
//    private OrderStatisticService orderStatisticService;

    @RequestMapping(value="/")
    public ModelAndView index(Model model)
    {
        ModelAndView mv =new ModelAndView();
        mv.setViewName("home");

        ArrayList<User> users=service.getAllUsers();
        mv.addObject("userList",users);

        return mv;
    }

    @RequestMapping(value="/test")
    public ModelAndView test(Model model)
    {
        ModelAndView mv =new ModelAndView();
        mv.setViewName("test");

        return mv;
    }

}