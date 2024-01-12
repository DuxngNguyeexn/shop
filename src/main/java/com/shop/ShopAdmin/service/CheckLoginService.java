package com.shop.ShopAdmin.service;

import com.shop.ShopAdmin.model.Admin;
import com.shop.ShopAdmin.repository.CheckLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CheckLoginService {
 @Autowired
    CheckLoginRepository checkLoginRepository;

    public Admin findAdmin(String id, String pass) {

        Admin admin = checkLoginRepository.findByIdAndPass(id, pass);
        return admin;
    }
}
