package org.ringcentral.application.controller;

import lombok.AllArgsConstructor;
import org.ringcentral.application.service.KioskService;
import org.ringcentral.library.entity.kisok.KioskEntity;
import org.ringcentral.library.entity.kisok.VendingMachineEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vending")
@AllArgsConstructor
public class VendingMachineController {

  private final KioskService kioskService;

  @PostMapping
  public VendingMachineEntity createVendingMachine(
      @RequestBody VendingMachineEntity vendingMachineEntity) {
    VendingMachineEntity kioskEntity = kioskService.createVendingMachine(vendingMachineEntity);
    return kioskEntity;
  }

}
