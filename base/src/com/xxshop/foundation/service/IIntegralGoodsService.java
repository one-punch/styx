package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.IntegralGoods;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IIntegralGoodsService
{
  public abstract boolean save(IntegralGoods integralGoods);

  public abstract IntegralGoods getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(IntegralGoods integralGoods);

  public abstract List<IntegralGoods> query(String query, Map map, int begin, int max);
}

