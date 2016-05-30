package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.SpareGoodsClass;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ISpareGoodsClassService
{
  public abstract boolean save(SpareGoodsClass spareGoodsClass);

  public abstract SpareGoodsClass getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(SpareGoodsClass spareGoodsClass);

  public abstract List<SpareGoodsClass> query(String query, Map map, int begin, int max);
}

