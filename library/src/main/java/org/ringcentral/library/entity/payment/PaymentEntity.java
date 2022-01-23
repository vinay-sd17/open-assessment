package org.ringcentral.library.entity.payment;

import lombok.Data;
import org.ringcentral.library.entity.AuditEntity;

@Data
public class PaymentEntity extends AuditEntity {

  private String id;
  
  private String paymentMode;

  private String orderTraceId;

  private PaymentStatus status;
  
  private String description;

}
