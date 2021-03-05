package com.fduran.spring.movie.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.fduran.spring.movie.entity.User;
import com.fduran.spring.movie.user.CrmUser;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
