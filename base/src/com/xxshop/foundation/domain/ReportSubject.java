 package com.xxshop.foundation.domain;
 
 import com.xxshop.core.domain.IdEntity;

 import javax.persistence.Entity;
 import javax.persistence.FetchType;
 import javax.persistence.ManyToOne;
 import javax.persistence.Table;
 import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
 
 @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
 @Entity
 @Table(name="xxshop_report_subject")
 public class ReportSubject extends IdEntity
 {
   private String title;
 
   @ManyToOne(fetch=FetchType.LAZY)
   private ReportType type;
 
   public String getTitle()
   {
     return this.title;
   }
 
   public void setTitle(String title) {
     this.title = title;
   }
 
   public ReportType getType() {
     return this.type;
   }
 
   public void setType(ReportType type) {
     this.type = type;
   }
 }

