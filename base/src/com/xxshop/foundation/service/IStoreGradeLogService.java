package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.StoreGradeLog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStoreGradeLogService
{
  public abstract boolean save(StoreGradeLog storeGradeLog);

  public abstract StoreGradeLog getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(StoreGradeLog storeGradeLog);

  public abstract List<StoreGradeLog> query(String query, Map map, int begin, int max);
}

