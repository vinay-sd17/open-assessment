package org.ringcentral.library.entity.order;

import lombok.Data;

@Data
public class OrderFullfilment {
  
  private String id;
  
  private String paymentId;
  
  private FullFilmentStatus status;
  
}
