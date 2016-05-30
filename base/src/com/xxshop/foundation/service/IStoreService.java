package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Store;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStoreService
{
  public abstract boolean save(Store store);

  public abstract Store getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Store store);

  public abstract List<Store> query(String query, Map map, int begin, int max);

  public abstract Store getObjByProperty(String propertyName, Object value);
}

