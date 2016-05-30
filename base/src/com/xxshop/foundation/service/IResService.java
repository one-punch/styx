package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Res;

import java.util.List;
import java.util.Map;

public abstract interface IResService
{
  public abstract boolean save(Res res);

  public abstract boolean delete(Long id);

  public abstract boolean update(Res res);

  public abstract Res getObjById(Long id);

  public abstract List<Res> query(String query, Map map, int begin, int max);

  public abstract IPageList list(IQueryObject queryObject);
}

