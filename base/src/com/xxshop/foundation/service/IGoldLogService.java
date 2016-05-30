package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoldLog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoldLogService
{
  public abstract boolean save(GoldLog goldLog);

  public abstract GoldLog getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoldLog goldLog);

  public abstract List<GoldLog> query(String query, Map map, int begin, int max);
}

