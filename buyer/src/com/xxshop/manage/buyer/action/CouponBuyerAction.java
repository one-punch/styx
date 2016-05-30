 package com.xxshop.manage.buyer.action;
 
      import com.xxshop.core.annotation.SecurityMapping;
import com.xxshop.core.domain.virtual.SysMap;
import com.xxshop.core.mv.JModelAndView;
import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.security.support.SecurityUserHolder;
import com.xxshop.core.tools.CommUtil;
import com.xxshop.foundation.domain.User;
import com.xxshop.foundation.domain.query.CouponInfoQueryObject;
import com.xxshop.foundation.service.ICouponInfoService;
import com.xxshop.foundation.service.ISysConfigService;
import com.xxshop.foundation.service.IUserConfigService;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
 @Controller
 public class CouponBuyerAction
 {
 
   @Autowired
   private ISysConfigService configService;
 
   @Autowired
   private IUserConfigService userConfigService;
 
   @Autowired
   private ICouponInfoService couponInfoService;
 
   @SecurityMapping(title="买家优惠券列表", value="/buyer/coupon.htm*", rtype="buyer", rname="用户中心", rcode="user_center", rgroup="用户中心", display = false, rsequence = 0)
   @RequestMapping({"/buyer/coupon.htm"})
   public ModelAndView coupon(HttpServletRequest request, HttpServletResponse response, String reply, String currentPage)
   {
     ModelAndView mv = new JModelAndView(
       "user/default/usercenter/buyer_coupon.html", this.configService
       .getSysConfig(), 
       this.userConfigService.getUserConfig(), 0, request, response);
     CouponInfoQueryObject qo = new CouponInfoQueryObject(currentPage, mv, 
       "addTime", "desc");
     qo.addQuery("obj.user.id", 
       new SysMap("user_id", 
       SecurityUserHolder.getCurrentUser().getId()), "=");
     IPageList pList = this.couponInfoService.list(qo);
     CommUtil.saveIPageList2ModelAndView("", "", "", pList, mv);
     return mv;
   }
 }

