package org.ringcentral.library.api.kiosk;

import java.util.List;

import org.ringcentral.library.entity.kisok.KioskEntity;
import org.ringcentral.library.entity.kisok.VendingMachineEntity;

public interface IKiosk {

  KioskEntity createKiosk(KioskEntity entity);
  
  List<KioskEntity> getAllKiosks();
  
  VendingMachineEntity createVendingMachine(VendingMachineEntity entity);

  KioskEntity updateKiosk(String id, KioskEntity entity);

}
