package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Navigation;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface INavigationService
{
  public abstract boolean save(Navigation navigation);

  public abstract Navigation getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Navigation navigation);

  public abstract List<Navigation> query(String query, Map map, int begin, int max);
}

