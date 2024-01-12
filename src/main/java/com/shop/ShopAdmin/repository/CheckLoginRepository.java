package com.shop.ShopAdmin.repository;

import com.shop.ShopAdmin.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckLoginRepository extends JpaRepository <Admin , String> {
    Admin findByIdAndPass(String id, String pass);
}
