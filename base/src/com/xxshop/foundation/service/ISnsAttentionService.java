package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.SnsAttention;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ISnsAttentionService
{
  public abstract boolean save(SnsAttention snsAttention);

  public abstract SnsAttention getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(SnsAttention snsAttention);

  public abstract List<SnsAttention> query(String query, Map map, int begin, int max);
}

