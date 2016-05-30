package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.OrderForm;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IOrderFormService
{
  public abstract boolean save(OrderForm order);

  public abstract OrderForm getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(OrderForm order);

  public abstract List<OrderForm> query(String query, Map map, int begin, int max);
  
  public OrderForm findByOrderId(String orderId);
}

