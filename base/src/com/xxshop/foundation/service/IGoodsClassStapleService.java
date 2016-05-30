package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoodsClassStaple;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsClassStapleService
{
  public abstract boolean save(GoodsClassStaple goodsClassStaple);

  public abstract GoodsClassStaple getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoodsClassStaple goodsClassStaple);

  public abstract List<GoodsClassStaple> query(String query, Map map, int begin, int max);
}

