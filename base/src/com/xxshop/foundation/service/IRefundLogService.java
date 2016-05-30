package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.RefundLog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IRefundLogService
{
  public abstract boolean save(RefundLog refundLog);

  public abstract RefundLog getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(RefundLog refundLog);

  public abstract List<RefundLog> query(String query, Map map, int begin, int max);
}

