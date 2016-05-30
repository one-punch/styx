package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoodsClass;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsClassService
{
  public abstract boolean save(GoodsClass goodsClass);

  public abstract GoodsClass getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoodsClass goodsClass);

  public abstract List<GoodsClass> query(String query, Map map, int begin, int max);

  public abstract GoodsClass getObjByProperty(String paramString, Object paramObject);
}

