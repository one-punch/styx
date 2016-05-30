package com.xxshop.foundation.service;

import com.xxshop.foundation.domain.SysConfig;

public abstract interface ISysConfigService
{
  public abstract boolean save(SysConfig sysConfig);

  public abstract boolean delete(SysConfig sysConfig);

  public abstract boolean update(SysConfig sysConfig);

  public abstract SysConfig getSysConfig();
}

