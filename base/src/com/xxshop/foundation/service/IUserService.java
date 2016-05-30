package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.User;

import java.util.List;
import java.util.Map;

public abstract interface IUserService
{
  public abstract boolean save(User user);

  public abstract boolean delete(Long id);

  public abstract boolean update(User user);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract User getObjById(Long id);

  public abstract User getObjByProperty(String propertyName, String value);

  public abstract List<User> query(String query, Map map, int begin, int max);
}

