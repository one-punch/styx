package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Partner;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IPartnerService
{
  public abstract boolean save(Partner partner);

  public abstract Partner getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Partner partner);

  public abstract List<Partner> query(String query, Map map, int begin, int max);
}

