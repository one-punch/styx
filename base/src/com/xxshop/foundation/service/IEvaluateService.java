package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Evaluate;
import com.xxshop.foundation.domain.Goods;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IEvaluateService
{
  public abstract boolean save(Evaluate dvaluate);

  public abstract Evaluate getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Evaluate dvaluate);

  public abstract List<Evaluate> query(String query, Map map, int begin, int max);

  public abstract List<Goods> query_goods(String query, Map map, int begin, int max);
}

