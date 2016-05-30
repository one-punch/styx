package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.SpareGoodsFloor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ISpareGoodsFloorService
{
  public abstract boolean save(SpareGoodsFloor spareGoodsFloor);

  public abstract SpareGoodsFloor getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(SpareGoodsFloor spareGoodsFloor);

  public abstract List<SpareGoodsFloor> query(String query, Map map, int begin, int max);
}

