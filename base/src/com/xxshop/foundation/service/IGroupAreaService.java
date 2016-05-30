package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GroupArea;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGroupAreaService
{
  public abstract boolean save(GroupArea groupArea);

  public abstract GroupArea getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GroupArea groupArea);

  public abstract List<GroupArea> query(String query, Map map, int begin, int max);
}

