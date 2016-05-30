package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.ZTCGoldLog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IZTCGoldLogService
{
  public abstract boolean save(ZTCGoldLog ztcGoldLog);

  public abstract ZTCGoldLog getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(ZTCGoldLog ztcGoldLog);

  public abstract List<ZTCGoldLog> query(String query, Map map, int begin, int max);
}

