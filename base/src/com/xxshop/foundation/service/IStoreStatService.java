package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.StoreStat;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStoreStatService
{
  public abstract boolean save(StoreStat storeStat);

  public abstract StoreStat getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(StoreStat storeStat);

  public abstract List<StoreStat> query(String query, Map map, int begin, int max);
}

