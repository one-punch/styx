package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GroupClass;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGroupClassService
{
  public abstract boolean save(GroupClass groupClass);

  public abstract GroupClass getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GroupClass groupClass);

  public abstract List<GroupClass> query(String query, Map map, int begin, int max);
}

