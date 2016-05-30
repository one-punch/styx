package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.CombinLog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ICombinLogService
{
  public abstract boolean save(CombinLog combinLog);

  public abstract CombinLog getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(CombinLog combinLog);

  public abstract List<CombinLog> query(String query, Map map, int begin, int max);
}

