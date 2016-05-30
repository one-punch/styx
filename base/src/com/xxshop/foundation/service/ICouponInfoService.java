package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.CouponInfo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ICouponInfoService
{
  public abstract boolean save(CouponInfo couponInfo);

  public abstract CouponInfo getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(CouponInfo couponInfo);

  public abstract List<CouponInfo> query(String query, Map map, int begin, int max);
}

