 package com.xxshop.foundation.domain.query;
 
 import com.xxshop.core.query.QueryObject;

import org.springframework.web.servlet.ModelAndView;
 
 public class ChattingQueryObject extends QueryObject
 {
   public ChattingQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public ChattingQueryObject()
   {
   }
 }

