package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Accessory;

import java.util.List;
import java.util.Map;

public abstract interface IAccessoryService
{
  public abstract boolean save(Accessory accessory);

  public abstract boolean delete(Long id);

  public abstract boolean update(Accessory accessory);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract Accessory getObjById(Long id);

  public abstract Accessory getObjByProperty(String propertyName, String value);

  public abstract List<Accessory> query(String query, Map map, int begin, int max);
}
