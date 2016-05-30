package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.IntegralGoodsOrder;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IIntegralGoodsOrderService
{
  public abstract boolean save(IntegralGoodsOrder integralGoodsOrder);

  public abstract IntegralGoodsOrder getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(IntegralGoodsOrder integralGoodsOrder);

  public abstract List<IntegralGoodsOrder> query(String query, Map map, int begin, int max);
}

