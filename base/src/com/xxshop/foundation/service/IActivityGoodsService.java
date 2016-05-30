package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.ActivityGoods;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IActivityGoodsService
{
  public abstract boolean save(ActivityGoods activityGoods);

  public abstract ActivityGoods getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(ActivityGoods activityGoods);

  public abstract List<ActivityGoods> query(String query, Map map, int begin, int max);
}

