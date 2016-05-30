package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.StoreClass;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStoreClassService
{
  public abstract boolean save(StoreClass storeClass);

  public abstract StoreClass getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(StoreClass storeClass);

  public abstract List<StoreClass> query(String query, Map map, int begin, int max);
}

