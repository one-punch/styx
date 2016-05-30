package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoodsReturn;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsReturnService
{
  public abstract boolean save(GoodsReturn goodsReturn);

  public abstract GoodsReturn getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoodsReturn goodsReturn);

  public abstract List<GoodsReturn> query(String query, Map map, int begin, int max);
}

