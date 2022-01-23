package org.ringcentral.library.entity.kisok;

import java.util.List;

import lombok.Data;
import org.ringcentral.library.entity.AuditEntity;

@Data
public class KioskEntity extends AuditEntity {

  private String id;

  private String address;

  private List<VendingMachineEntity> vendingMachineEntities;
}
