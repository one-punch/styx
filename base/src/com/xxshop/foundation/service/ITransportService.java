package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Transport;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ITransportService
{
  public abstract boolean save(Transport transport);

  public abstract Transport getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Transport transport);

  public abstract List<Transport> query(String query, Map map, int begin, int max);
}

