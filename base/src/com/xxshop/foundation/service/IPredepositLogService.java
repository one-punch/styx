package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.PredepositLog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IPredepositLogService
{
  public abstract boolean save(PredepositLog predepositLog);

  public abstract PredepositLog getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(PredepositLog predepositLog);

  public abstract List<PredepositLog> query(String query, Map map, int begin, int max);
}

