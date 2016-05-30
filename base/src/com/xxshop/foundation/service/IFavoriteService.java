package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Favorite;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IFavoriteService
{
  public abstract boolean save(Favorite favorite);

  public abstract Favorite getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Favorite favorite);

  public abstract List<Favorite> query(String query, Map map, int begin, int max);
}

