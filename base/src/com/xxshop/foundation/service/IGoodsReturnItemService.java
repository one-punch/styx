package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoodsReturnItem;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsReturnItemService
{
  public abstract boolean save(GoodsReturnItem goodsReturnItem);

  public abstract GoodsReturnItem getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoodsReturnItem goodsReturnItem);

  public abstract List<GoodsReturnItem> query(String query, Map map, int begin, int max);
}

