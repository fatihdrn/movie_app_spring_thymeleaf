package com.fduran.spring.movie.dao;

import com.fduran.spring.movie.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
