package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.PredepositCash;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IPredepositCashService
{
  public abstract boolean save(PredepositCash predepositCash);

  public abstract PredepositCash getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(PredepositCash predepositCash);

  public abstract List<PredepositCash> query(String query, Map map, int begin, int max);
}

