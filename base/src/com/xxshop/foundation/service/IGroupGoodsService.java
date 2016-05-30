package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GroupGoods;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGroupGoodsService
{
  public abstract boolean save(GroupGoods groupGoods);

  public abstract GroupGoods getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GroupGoods groupGoods);

  public abstract List<GroupGoods> query(String query, Map map, int begin, int max);
}

