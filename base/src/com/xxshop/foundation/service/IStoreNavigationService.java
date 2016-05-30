package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.StoreNavigation;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStoreNavigationService
{
  public abstract boolean save(StoreNavigation storeNavigation);

  public abstract StoreNavigation getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(StoreNavigation storeNavigation);

  public abstract List<StoreNavigation> query(String query, Map map, int begin, int max);
}

