package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoodsBrandCategory;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsBrandCategoryService
{
  public abstract boolean save(GoodsBrandCategory goodsBrandCategory);

  public abstract GoodsBrandCategory getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoodsBrandCategory goodsBrandCategory);

  public abstract List<GoodsBrandCategory> query(String query, Map map, int begin, int max);

  public abstract GoodsBrandCategory getObjByProperty(String paramString, Object paramObject);
}

