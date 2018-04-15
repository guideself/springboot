package com.thinkdo.springboot.user.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkdo.springboot.user.bean.User;

public interface UserService extends JpaRepository<User, String> {
}
