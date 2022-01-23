package org.ringcentral.library.entity.order;

import lombok.Data;
import org.ringcentral.library.entity.AuditEntity;

@Data
public class OrderEntity extends AuditEntity {
  
  private String id; //
  
  private String cartId;
  
  private OrderStatus orderStatus;

}
