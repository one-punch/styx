package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.RoleGroup;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IRoleGroupService
{
  public abstract boolean save(RoleGroup roleGroup);

  public abstract RoleGroup getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(RoleGroup roleGroup);

  public abstract List<RoleGroup> query(String query, Map map, int begin, int max);

  public abstract RoleGroup getObjByProperty(String propertyName, Object value);
}

