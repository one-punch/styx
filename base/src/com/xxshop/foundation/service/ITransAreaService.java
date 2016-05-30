package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.TransArea;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ITransAreaService
{
  public abstract boolean save(TransArea transArea);

  public abstract TransArea getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(TransArea transArea);

  public abstract List<TransArea> query(String query, Map map, int begin, int max);
}

