package org.ringcentral.library.entity.kisok;

import java.util.List;

import lombok.Data;
import org.ringcentral.library.entity.AuditEntity;

@Data
public class VendingMachineEntity extends AuditEntity {

  private String id;

  private String details;

  private List<PaymentMode> supportedPaymentModes;
}
