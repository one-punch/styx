package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.HomePageGoodsClass;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IHomePageGoodsClassService
{
  public abstract boolean save(HomePageGoodsClass homePageGoodsClass);

  public abstract HomePageGoodsClass getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(HomePageGoodsClass homePageGoodsClass);

  public abstract List<HomePageGoodsClass> query(String query, Map map, int begin, int max);
}

