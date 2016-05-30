package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Complaint;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IComplaintService
{
  public abstract boolean save(Complaint complaint);

  public abstract Complaint getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Complaint complaint);

  public abstract List<Complaint> query(String query, Map map, int begin, int max);
}

