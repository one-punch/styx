package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.StorePoint;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStorePointService
{
  public abstract boolean save(StorePoint storePoint);

  public abstract StorePoint getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(StorePoint storePoint);

  public abstract List<StorePoint> query(String query, Map map, int begin, int max);
}

