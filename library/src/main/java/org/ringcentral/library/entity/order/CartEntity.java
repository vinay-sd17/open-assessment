package org.ringcentral.library.entity.order;

import java.util.HashMap;

import lombok.Data;

@Data
public class CartEntity {

  private String id;
  
  private String vendingMacId;
  
  //key is product id
  private HashMap<String, Integer> products;
  
  private double cartTotal;
  
}
