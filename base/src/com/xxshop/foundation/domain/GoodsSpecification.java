 package com.xxshop.foundation.domain;
 
 import com.xxshop.core.domain.IdEntity;

 import java.util.ArrayList;
 import java.util.List;
 import javax.persistence.Entity;
 import javax.persistence.ManyToMany;
 import javax.persistence.OneToMany;
 import javax.persistence.OrderBy;
 import javax.persistence.Table;
 import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
 
 @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
 @Entity
 @Table(name="xxshop_goodsspecification")
 public class GoodsSpecification extends IdEntity
 {
   private String name;
   private int sequence;
   private String type;
 
   @ManyToMany(mappedBy="gss")
   private List<GoodsType> types = new ArrayList();
 
   @OneToMany(mappedBy="spec")
   @OrderBy("sequence asc")
   private List<GoodsSpecProperty> properties = new ArrayList();
 
   public String getName() {
     return this.name;
   }
 
   public void setName(String name) {
     this.name = name;
   }
 
   public int getSequence() {
     return this.sequence;
   }
 
   public void setSequence(int sequence) {
     this.sequence = sequence;
   }
 
   public String getType() {
     return this.type;
   }
 
   public void setType(String type) {
     this.type = type;
   }
 
   public List<GoodsType> getTypes() {
     return this.types;
   }
 
   public void setTypes(List<GoodsType> types) {
     this.types = types;
   }
 
   public List<GoodsSpecProperty> getProperties() {
     return this.properties;
   }
 
   public void setProperties(List<GoodsSpecProperty> properties) {
     this.properties = properties;
   }
 }

