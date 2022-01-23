package org.ringcentral.library.entity.inventory;

import java.util.List;

import lombok.Data;
import org.ringcentral.library.entity.AuditEntity;

@Data
public class ProductEntity extends AuditEntity {
  
  private String id;
  
  private String name;
  
  private double price;
  
  private List<ProductCategory> productCategories;
}
