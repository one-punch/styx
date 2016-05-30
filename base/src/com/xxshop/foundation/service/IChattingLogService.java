package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.ChattingLog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IChattingLogService
{
  public abstract boolean save(ChattingLog chattingLog);

  public abstract ChattingLog getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(ChattingLog chattingLog);

  public abstract List<ChattingLog> query(String query, Map map, int begin, int max);
}

