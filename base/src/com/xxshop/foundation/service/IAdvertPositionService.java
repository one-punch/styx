package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.AdvertPosition;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IAdvertPositionService
{
  public abstract boolean save(AdvertPosition advertPosition);

  public abstract AdvertPosition getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(AdvertPosition advertPosition);

  public abstract List<AdvertPosition> query(String query, Map map, int begin, int max);
}

