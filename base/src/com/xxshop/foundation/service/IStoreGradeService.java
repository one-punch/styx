package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.StoreGrade;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStoreGradeService
{
  public abstract boolean save(StoreGrade storeGrade);

  public abstract StoreGrade getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(StoreGrade storeGrade);

  public abstract List<StoreGrade> query(String query, Map map, int begin, int max);
}

