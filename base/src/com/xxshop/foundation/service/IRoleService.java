package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Role;

import java.util.List;
import java.util.Map;

public abstract interface IRoleService
{
  public abstract boolean save(Role role);

  public abstract boolean delete(Long id);

  public abstract boolean update(Role role);

  public abstract Role getObjById(Long id);

  public abstract List<Role> query(String query, Map map, int begin, int max);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract Role getObjByProperty(String propertyName, Object value);
}

