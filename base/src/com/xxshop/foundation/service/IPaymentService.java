package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Payment;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IPaymentService
{
  public abstract boolean save(Payment payment);

  public abstract Payment getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Payment payment);

  public abstract List<Payment> query(String query, Map map, int begin, int max);

  public abstract Payment getObjByProperty(String propertyName, String value);
}

