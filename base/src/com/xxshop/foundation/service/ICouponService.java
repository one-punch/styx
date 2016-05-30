package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Coupon;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ICouponService
{
  public abstract boolean save(Coupon coupon);

  public abstract Coupon getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Coupon coupon);

  public abstract List<Coupon> query(String query, Map map, int begin, int max);
}

