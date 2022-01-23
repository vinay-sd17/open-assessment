package org.ringcentral.application.controller;

import java.util.List;

import lombok.AllArgsConstructor;
import org.ringcentral.application.service.KioskService;
import org.ringcentral.library.entity.kisok.KioskEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kiosk")
@AllArgsConstructor
public class KioskController {

  private final KioskService kioskService;

  @PostMapping
  public KioskEntity createKiosk(@RequestBody KioskEntity kiosk) {
    KioskEntity kioskEntity = kioskService.createKiosk(kiosk);
    return kioskEntity;
  }
  
  @GetMapping
  public List<KioskEntity> getAllKiosks() {
    return kioskService.getAllKiosks();
  }
}
