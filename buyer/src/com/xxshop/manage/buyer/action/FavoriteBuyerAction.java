 package com.xxshop.manage.buyer.action;
 
      import com.xxshop.core.annotation.SecurityMapping;
import com.xxshop.core.domain.virtual.SysMap;
import com.xxshop.core.mv.JModelAndView;
import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.security.support.SecurityUserHolder;
import com.xxshop.core.tools.CommUtil;
import com.xxshop.foundation.domain.Favorite;
import com.xxshop.foundation.domain.SysConfig;
import com.xxshop.foundation.domain.User;
import com.xxshop.foundation.domain.query.FavoriteQueryObject;
import com.xxshop.foundation.service.IFavoriteService;
import com.xxshop.foundation.service.ISysConfigService;
import com.xxshop.foundation.service.IUserConfigService;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
 @Controller
 public class FavoriteBuyerAction
 {
 
   @Autowired
   private ISysConfigService configService;
 
   @Autowired
   private IUserConfigService userConfigService;
 
   @Autowired
   private IFavoriteService favoriteService;
 
   @SecurityMapping(title="用户商品收藏", value="/buyer/favorite_goods.htm*", rtype="buyer", rname="用户中心", rcode="user_center", rgroup="用户中心", display = false, rsequence = 0)
   @RequestMapping({"/buyer/favorite_goods.htm"})
   public ModelAndView favorite_goods(HttpServletRequest request, HttpServletResponse response, String currentPage, String orderBy, String orderType)
   {
     ModelAndView mv = new JModelAndView(
       "user/default/usercenter/favorite_goods.html", this.configService
       .getSysConfig(), 
       this.userConfigService.getUserConfig(), 0, request, response);
     String url = this.configService.getSysConfig().getAddress();
     if ((url == null) || (url.equals(""))) {
       url = CommUtil.getURL(request);
     }
     String params = "";
     FavoriteQueryObject qo = new FavoriteQueryObject(currentPage, mv, 
       orderBy, orderType);
     qo.addQuery("obj.type", new SysMap("type", Integer.valueOf(0)), "=");
     qo.addQuery("obj.user.id", 
       new SysMap("user_id", 
       SecurityUserHolder.getCurrentUser().getId()), "=");
     IPageList pList = this.favoriteService.list(qo);
     CommUtil.saveIPageList2ModelAndView(url + "/buyer/favorite_goods.htm", 
       "", params, pList, mv);
     return mv;
   }
 
   @SecurityMapping(title="用户店铺收藏", value="/buyer/favorite_store.htm*", rtype="buyer", rname="用户中心", rcode="user_center", rgroup="用户中心", display = false, rsequence = 0)
   @RequestMapping({"/buyer/favorite_store.htm"})
   public ModelAndView favorite_store(HttpServletRequest request, HttpServletResponse response, String currentPage, String orderBy, String orderType)
   {
     ModelAndView mv = new JModelAndView(
       "user/default/usercenter/favorite_store.html", this.configService
       .getSysConfig(), 
       this.userConfigService.getUserConfig(), 0, request, response);
     String url = this.configService.getSysConfig().getAddress();
     if ((url == null) || (url.equals(""))) {
       url = CommUtil.getURL(request);
     }
     String params = "";
     FavoriteQueryObject qo = new FavoriteQueryObject(currentPage, mv, 
       orderBy, orderType);
     qo.addQuery("obj.type", new SysMap("type", Integer.valueOf(1)), "=");
     qo.addQuery("obj.user.id", 
       new SysMap("user_id", 
       SecurityUserHolder.getCurrentUser().getId()), "=");
     IPageList pList = this.favoriteService.list(qo);
     CommUtil.saveIPageList2ModelAndView(url + "/buyer/favorite_store.htm", 
       "", params, pList, mv);
     return mv;
   }
 
   @SecurityMapping(title="用户收藏删除", value="/buyer/favorite_del.htm*", rtype="buyer", rname="用户中心", rcode="user_center", rgroup="用户中心", display = false, rsequence = 0)
   @RequestMapping({"/buyer/favorite_del.htm"})
   public String favorite_del(HttpServletRequest request, HttpServletResponse response, String mulitId, String currentPage, int type) {
     String[] ids = mulitId.split(",");
     for (String id : ids) {
       if (!id.equals("")) {
         Favorite favorite = this.favoriteService.getObjById(
           Long.valueOf(Long.parseLong(id)));
         this.favoriteService.delete(Long.valueOf(Long.parseLong(id)));
       }
     }
     if (type == 0) {
       return "redirect:favorite_goods.htm?currentPage=" + currentPage;
     }
     return "redirect:favorite_store.htm?currentPage=" + currentPage;
   }
 }

