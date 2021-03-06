package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoodsBrand;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsBrandService
{
  public abstract boolean save(GoodsBrand goodsBrand);

  public abstract GoodsBrand getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoodsBrand goodsBrand);

  public abstract List<GoodsBrand> query(String query, Map map, int begin, int max);
}

