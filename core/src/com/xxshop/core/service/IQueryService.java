package com.xxshop.core.service;

import java.util.List;
import java.util.Map;

public abstract interface IQueryService
{
  public abstract List query(String query, Map map, int begin, int max);
}

