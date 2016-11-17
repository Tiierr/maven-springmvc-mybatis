package com.ray.controller;

import com.ray.model.User;
import com.ray.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String  add(){
        return "addUser";
    }

    // post请求，处理添加用户请求，并重定向到用户管理页面
    @RequestMapping(value = "/addP", method = RequestMethod.POST)
    public String addUserPost(@ModelAttribute("user") User user) {
        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(userEntity);

        // 数据库中添加一个用户，并立即刷新缓存
        service.addUser(user);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/";
    }
    // 更新用户信息 页面
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public ModelAndView updateUser(@PathVariable("id") Integer userId, Model model) {



        ModelAndView mv =new ModelAndView();
        mv.setViewName("updateUser");

        // 找到userId所表示的用户
        User user = service.getUser(userId);

        // 传递给请求页面
        mv.addObject("user",user);

        return mv;
    }

    // 更新用户信息 操作
    @RequestMapping(value = "/updateP", method = RequestMethod.POST)
    public String updateUserPost(@ModelAttribute("user") User user) {

        service.updateUser(user);

        return "redirect:/";
    }


    // 删除用户
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") Integer userId) {

        // 删除id为userId的用户
        service.deleteUser(userId);

        return "redirect:/";
    }

}