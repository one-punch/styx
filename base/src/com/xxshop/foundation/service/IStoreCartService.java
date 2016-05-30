package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.StoreCart;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStoreCartService
{
  public abstract boolean save(StoreCart storeCart);

  public abstract StoreCart getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(StoreCart storeCart);

  public abstract List<StoreCart> query(String query, Map map, int begin, int max);
}

