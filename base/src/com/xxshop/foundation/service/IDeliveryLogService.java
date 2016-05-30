package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.DeliveryLog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IDeliveryLogService
{
  public abstract boolean save(DeliveryLog deliveryLog);

  public abstract DeliveryLog getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(DeliveryLog deliveryLog);

  public abstract List<DeliveryLog> query(String query, Map map, int begin, int max);
}

