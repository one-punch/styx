package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Message;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IMessageService
{
  public abstract boolean save(Message message);

  public abstract Message getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Message message);

  public abstract List<Message> query(String query, Map map, int begin, int max);
}

