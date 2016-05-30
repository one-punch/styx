package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GroupPriceRange;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGroupPriceRangeService
{
  public abstract boolean save(GroupPriceRange groupPriceRange);

  public abstract GroupPriceRange getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GroupPriceRange groupPriceRange);

  public abstract List<GroupPriceRange> query(String query, Map map, int begin, int max);
}

