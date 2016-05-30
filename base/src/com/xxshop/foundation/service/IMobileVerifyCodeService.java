package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.MobileVerifyCode;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IMobileVerifyCodeService
{
  public abstract boolean save(MobileVerifyCode mobileVerifyCode);

  public abstract MobileVerifyCode getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(MobileVerifyCode mobileVerifyCode);

  public abstract List<MobileVerifyCode> query(String query, Map map, int begin, int max);

  public abstract MobileVerifyCode getObjByProperty(String propertyName, Object value);
}

