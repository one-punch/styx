package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.ExpressCompany;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IExpressCompanyService
{
  public abstract boolean save(ExpressCompany expressCompany);

  public abstract ExpressCompany getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(ExpressCompany expressCompany);

  public abstract List<ExpressCompany> query(String query, Map map, int begin, int max);
}

