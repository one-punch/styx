package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Visit;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IVisitService
{
  public abstract boolean save(Visit visit);

  public abstract Visit getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Visit visit);

  public abstract List<Visit> query(String query, Map map, int begin, int max);
}

