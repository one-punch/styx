package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Dynamic;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IDynamicService
{
  public abstract boolean save(Dynamic dynamic);

  public abstract Dynamic getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Dynamic dynamic);

  public abstract List<Dynamic> query(String query, Map map, int begin, int max);
}

