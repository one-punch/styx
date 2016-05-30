package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Album;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IAlbumService
{
  public abstract boolean save(Album album);

  public abstract Album getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Album album);

  public abstract List<Album> query(String query, Map map, int begin, int max);

  public abstract Album getDefaultAlbum(Long paramLong);
}

