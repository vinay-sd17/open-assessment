package org.ringcentral.library.entity.inventory;

import lombok.Data;

@Data
public class InventoryEntity {

  private String id;
  
  private String productId; 
  
  private int noOfProductsAvailable;
  
}
