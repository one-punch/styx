package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.SpareGoods;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ISpareGoodsService
{
  public abstract boolean save(SpareGoods spareGoods);

  public abstract SpareGoods getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(SpareGoods spareGoods);

  public abstract List<SpareGoods> query(String query, Map map, int begin, int max);
}

