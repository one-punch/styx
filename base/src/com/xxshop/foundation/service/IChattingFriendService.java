package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.ChattingFriend;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IChattingFriendService
{
  public abstract boolean save(ChattingFriend chattingFriend);

  public abstract ChattingFriend getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(ChattingFriend chattingFriend);

  public abstract List<ChattingFriend> query(String query, Map map, int begin, int max);
}

