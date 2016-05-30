package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Consult;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IConsultService
{
  public abstract boolean save(Consult consult);

  public abstract Consult getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Consult consult);

  public abstract List<Consult> query(String query, Map map, int begin, int max);
}

