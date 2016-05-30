package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.DeliveryGoods;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IDeliveryGoodsService
{
  public abstract boolean save(DeliveryGoods deliveryGoods);

  public abstract DeliveryGoods getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(DeliveryGoods deliveryGoods);

  public abstract List<DeliveryGoods> query(String query, Map map, int begin, int max);
}

