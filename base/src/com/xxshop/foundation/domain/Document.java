 package com.xxshop.foundation.domain;
 
 import com.xxshop.core.domain.IdEntity;

 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.Lob;
 import javax.persistence.Table;
 import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
 
 @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
 @Entity
 @Table(name="xxshop_document")
 public class Document extends IdEntity
 {
   private String mark;
   private String title;
 
   @Lob
   @Column(columnDefinition="LongText")
   private String content;
 
   public String getMark()
   {
     return this.mark;
   }
 
   public void setMark(String mark) {
     this.mark = mark;
   }
 
   public String getTitle() {
     return this.title;
   }
 
   public void setTitle(String title) {
     this.title = title;
   }
 
   public String getContent() {
     return this.content;
   }
 
   public void setContent(String content) {
     this.content = content;
   }
 }

