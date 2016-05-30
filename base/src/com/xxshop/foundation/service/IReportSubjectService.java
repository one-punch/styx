package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.ReportSubject;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IReportSubjectService
{
  public abstract boolean save(ReportSubject reportSubject);

  public abstract ReportSubject getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(ReportSubject reportSubject);

  public abstract List<ReportSubject> query(String query, Map map, int begin, int max);
}

