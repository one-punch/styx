package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.UserConfig;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IUserConfigService
{
  public abstract boolean save(UserConfig userConfig);

  public abstract UserConfig getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(UserConfig userConfig);

  public abstract List<UserConfig> query(String query, Map map, int begin, int max);

  public abstract UserConfig getUserConfig();
}

