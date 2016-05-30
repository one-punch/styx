package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.StorePartner;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStorePartnerService
{
  public abstract boolean save(StorePartner storePartner);

  public abstract StorePartner getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(StorePartner storePartner);

  public abstract List<StorePartner> query(String query, Map map, int begin, int max);
}

