package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.StoreSlide;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStoreSlideService
{
  public abstract boolean save(StoreSlide storeSlide);

  public abstract StoreSlide getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(StoreSlide storeSlide);

  public abstract List<StoreSlide> query(String query, Map map, int begin, int max);
}

