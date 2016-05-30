package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Bargain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IBargainService
{
  public abstract boolean save(Bargain bargain);

  public abstract Bargain getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Bargain bargain);

  public abstract List<Bargain> query(String query, Map map, int begin, int max);
}

