 package com.xxshop.foundation.domain;
 
 import com.xxshop.core.domain.IdEntity;

 import javax.persistence.Entity;
 import javax.persistence.FetchType;
 import javax.persistence.OneToOne;
 import javax.persistence.Table;
 import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
 
 @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
 @Entity
 @Table(name="xxshop_userconfig")
 public class UserConfig extends IdEntity
 {
 
   @OneToOne(fetch=FetchType.LAZY)
   private User user;
 
   public User getUser()
   {
     return this.user;
   }
 
   public void setUser(User user) {
     this.user = user;
   }
 }

