package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.SysLog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ISysLogService
{
  public abstract boolean save(SysLog sysLog);

  public abstract SysLog getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(SysLog sysLog);

  public abstract List<SysLog> query(String query, Map map, int begin, int max);
}

