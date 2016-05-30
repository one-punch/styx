package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoodsFloor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsFloorService
{
  public abstract boolean save(GoodsFloor goodsFloor);

  public abstract GoodsFloor getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoodsFloor goodsFloor);

  public abstract List<GoodsFloor> query(String query, Map map, int begin, int max);
}

