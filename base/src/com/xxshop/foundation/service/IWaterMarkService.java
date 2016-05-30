package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.WaterMark;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IWaterMarkService
{
  public abstract boolean save(WaterMark waterMark);

  public abstract WaterMark getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(WaterMark waterMark);

  public abstract List<WaterMark> query(String query, Map map, int begin, int max);

  public abstract WaterMark getObjByProperty(String propertyName, Object value);
}

