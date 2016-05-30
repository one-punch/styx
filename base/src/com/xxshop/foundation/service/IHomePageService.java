package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.HomePage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IHomePageService
{
  public abstract boolean save(HomePage homePage);

  public abstract HomePage getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(HomePage homePage);

  public abstract List<HomePage> query(String query, Map map, int begin, int max);
}

