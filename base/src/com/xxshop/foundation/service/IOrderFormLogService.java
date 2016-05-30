package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.OrderFormLog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IOrderFormLogService
{
  public abstract boolean save(OrderFormLog orderFormLog);

  public abstract OrderFormLog getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(OrderFormLog orderFormLog);

  public abstract List<OrderFormLog> query(String query, Map map, int begin, int max);
}

