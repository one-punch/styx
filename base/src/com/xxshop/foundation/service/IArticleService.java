package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Article;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IArticleService
{
  public abstract boolean save(Article article);

  public abstract Article getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Article article);

  public abstract List<Article> query(String query, Map map, int begin, int max);

  public abstract Article getObjByProperty(String paramString, Object paramObject);
}

