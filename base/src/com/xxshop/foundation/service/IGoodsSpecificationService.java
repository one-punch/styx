package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.GoodsSpecification;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsSpecificationService
{
  public abstract boolean save(GoodsSpecification goodsSpecification);

  public abstract GoodsSpecification getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(GoodsSpecification goodsSpecification);

  public abstract List<GoodsSpecification> query(String query, Map map, int begin, int max);
}

