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
 @Table(name="xxshop_report_type")
 public class ReportType extends IdEntity
 {
   private String name;
 
   @Lob
   @Column(columnDefinition="LongText")
   private String content;
 
   public String getName()
   {
     return this.name;
   }
 
   public void setName(String name) {
     this.name = name;
   }
 
   public String getContent() {
     return this.content;
   }
 
   public void setContent(String content) {
     this.content = content;
   }
 }

