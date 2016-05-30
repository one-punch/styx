package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.ArticleClass;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IArticleClassService
{
  public abstract boolean save(ArticleClass articleClass);

  public abstract ArticleClass getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(ArticleClass articleClass);

  public abstract List<ArticleClass> query(String query, Map map, int begin, int max);

  public abstract ArticleClass getObjByPropertyName(String propertyName, Object value);
}

