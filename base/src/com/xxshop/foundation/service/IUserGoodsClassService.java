package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.UserGoodsClass;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IUserGoodsClassService
{
  public abstract boolean save(UserGoodsClass userGoodsClass);

  public abstract UserGoodsClass getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(UserGoodsClass userGoodsClass);

  public abstract List<UserGoodsClass> query(String query, Map map, int begin, int max);
}

