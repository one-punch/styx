package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Predeposit;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IPredepositService
{
  public abstract boolean save(Predeposit predeposit);

  public abstract Predeposit getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Predeposit predeposit);

  public abstract List<Predeposit> query(String query, Map map, int begin, int max);
}

