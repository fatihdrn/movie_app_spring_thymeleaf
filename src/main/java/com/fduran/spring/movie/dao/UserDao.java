package com.fduran.spring.movie.dao;

import com.fduran.spring.movie.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
