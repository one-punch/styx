package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Report;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IReportService
{
  public abstract boolean save(Report report);

  public abstract Report getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Report report);

  public abstract List<Report> query(String query, Map map, int begin, int max);
}

