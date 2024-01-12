package com.shop.ShopAdmin.controller;

import com.shop.ShopAdmin.model.Admin;
import com.shop.ShopAdmin.service.CheckLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping(path = "shop")
public class ShowLoginController {
    @RequestMapping (value = "login")
    public String login(){
        return "login";
    }
    @Autowired
    CheckLoginService checkLoginService;
    @RequestMapping (value = "checkLogin")
    public String CheckLogin(@ModelAttribute("Admin") Admin admin){
        System.out.println(admin.getId());
        System.out.println(admin.getPass());
       Admin adminCheck = checkLoginService.findAdmin(admin.getId(), admin.getPass());

       if(adminCheck!= null) {
           return "homePage";
       }else {
       return "login";}
    }
}

