 package com.xxshop.foundation.domain.query;
 
 import com.xxshop.core.query.QueryObject;

import org.springframework.web.servlet.ModelAndView;
 
 public class GoodsTypePropertyQueryObject extends QueryObject
 {
   public GoodsTypePropertyQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public GoodsTypePropertyQueryObject()
   {
   }
 }

