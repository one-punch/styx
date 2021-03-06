package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Activity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IActivityService
{
  public abstract boolean save(Activity activity);

  public abstract Activity getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Activity activity);

  public abstract List<Activity> query(String query, Map map, int begin, int max);
}

