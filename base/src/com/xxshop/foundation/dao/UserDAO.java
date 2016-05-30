package com.xxshop.foundation.dao;

import com.xxshop.core.base.GenericDAO;
import com.xxshop.foundation.domain.User;

import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAO extends GenericDAO<User>
{
}

