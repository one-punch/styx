package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Template;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ITemplateService
{
  public abstract boolean save(Template template);

  public abstract Template getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Template template);

  public abstract List<Template> query(String query, Map map, int begin, int max);

  public abstract Template getObjByProperty(String propertyName, Object value);
}

