package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoodsCart;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsCartService
{
  public abstract boolean save(GoodsCart goodsCart);

  public abstract GoodsCart getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoodsCart goodsCart);

  public abstract List<GoodsCart> query(String query, Map map, int begin, int max);
}

