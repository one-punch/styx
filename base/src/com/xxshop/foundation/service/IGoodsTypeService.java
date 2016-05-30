package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoodsType;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsTypeService
{
  public abstract boolean save(GoodsType goodsType);

  public abstract GoodsType getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoodsType goodsType);

  public abstract List<GoodsType> query(String query, Map map, int begin, int max);
}

