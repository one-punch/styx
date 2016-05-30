package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoodsSpecProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsSpecPropertyService
{
  public abstract boolean save(GoodsSpecProperty goodsSpecProperty);

  public abstract GoodsSpecProperty getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoodsSpecProperty goodsSpecProperty);

  public abstract List<GoodsSpecProperty> query(String query, Map map, int begin, int max);
}

