package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Address;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IAddressService
{
  public abstract boolean save(Address address);

  public abstract Address getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Address address);

  public abstract List<Address> query(String query, Map map, int begin, int max);
}

