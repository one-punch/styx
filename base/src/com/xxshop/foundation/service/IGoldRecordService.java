package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoldRecord;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoldRecordService
{
  public abstract boolean save(GoldRecord goldRecord);

  public abstract GoldRecord getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoldRecord goldRecord);

  public abstract List<GoldRecord> query(String query, Map map, int begin, int max);
}

