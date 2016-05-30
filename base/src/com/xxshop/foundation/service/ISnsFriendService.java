package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.SnsFriend;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ISnsFriendService
{
  public abstract boolean save(SnsFriend snsFriend);

  public abstract SnsFriend getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(SnsFriend snsFriend);

  public abstract List<SnsFriend> query(String query, Map map, int begin, int max);
}

