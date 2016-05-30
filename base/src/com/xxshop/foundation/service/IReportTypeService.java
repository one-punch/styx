package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.ReportType;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IReportTypeService
{
  public abstract boolean save(ReportType reportType);

  public abstract ReportType getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(ReportType reportType);

  public abstract List<ReportType> query(String query, Map map, int begin, int max);
}

