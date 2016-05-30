package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.IntegralGoodsCart;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IIntegralGoodsCartService
{
  public abstract boolean save(IntegralGoodsCart integralGoodsCart);

  public abstract IntegralGoodsCart getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(IntegralGoodsCart integralGoodsCart);

  public abstract List<IntegralGoodsCart> query(String query, Map map, int begin, int max);
}

