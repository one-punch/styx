package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Goods;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsService
{
  public abstract boolean save(Goods goods);

  public abstract Goods getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Goods goods);

  public abstract List<Goods> query(String query, Map map, int begin, int max);

  public abstract Goods getObjByProperty(String propertyName,  Object value);
}

