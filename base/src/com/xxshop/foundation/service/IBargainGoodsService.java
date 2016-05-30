package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.BargainGoods;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IBargainGoodsService
{
  public abstract boolean save(BargainGoods bargainGoods);

  public abstract BargainGoods getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(BargainGoods bargainGoods);

  public abstract List<BargainGoods> query(String query, Map map, int begin, int max);
}

