package org.ringcentral.application.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import org.ringcentral.library.entity.kisok.KioskEntity;
import org.ringcentral.library.entity.kisok.VendingMachineEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KioskServiceImpl implements KioskService {

  private HashMap<String, KioskEntity> kioskDetails;

  private HashMap<String, VendingMachineEntity> vendindMachineDetails;

  @Override
  public KioskEntity createKiosk(KioskEntity entity) {
    if (kioskDetails.isEmpty()) {
      kioskDetails = new HashMap<>();
    }
    entity.getVendingMachineEntities().forEach(mch -> {
      if (vendindMachineDetails.get(mch.getId()) == null) {
        throw new IllegalArgumentException("Vending machine details not available");
      }
    });
    entity.setId(UUID.randomUUID().toString());
    kioskDetails.put(entity.getId(), entity);
    return kioskDetails.get(entity.getId());
  }

  @Override
  public List<KioskEntity> getAllKiosks() {
    return new ArrayList<KioskEntity>(kioskDetails.values());
  }

  @Override
  public VendingMachineEntity createVendingMachine(VendingMachineEntity entity) {
    if (vendindMachineDetails.isEmpty()) {
      vendindMachineDetails = new HashMap<>();
    }
    entity.setId(UUID.randomUUID().toString());
    vendindMachineDetails.put(entity.getId(), entity);
    return vendindMachineDetails.get(entity.getId());
  }

  @Override
  public KioskEntity updateKiosk(String id, KioskEntity entity) {
    return null;
  }
}
