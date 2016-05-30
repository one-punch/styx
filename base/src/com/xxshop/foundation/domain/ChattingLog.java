 package com.xxshop.foundation.domain;
 
 import com.xxshop.core.domain.IdEntity;

 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.FetchType;
 import javax.persistence.ManyToOne;
 import javax.persistence.Table;
 import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
 
 @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
 @Entity
 @Table(name="xxshop_chattinglog")
 public class ChattingLog extends IdEntity
 {
 
   @ManyToOne(fetch=FetchType.LAZY)
   private Chatting chatting;
 
   @ManyToOne(fetch=FetchType.LAZY)
   private User user;
 
   @Column(columnDefinition="LongText")
   private String content;
 
   @Column(columnDefinition="int default 0")
   private int mark;
 
   public int getMark()
   {
     return this.mark;
   }
 
   public void setMark(int mark) {
     this.mark = mark;
   }
 
   public Chatting getChatting() {
     return this.chatting;
   }
 
   public void setChatting(Chatting chatting) {
     this.chatting = chatting;
   }
 
   public User getUser() {
     return this.user;
   }
 
   public void setUser(User user) {
     this.user = user;
   }
 
   public String getContent() {
     return this.content;
   }
 
   public void setContent(String content) {
     this.content = content;
   }
 }

