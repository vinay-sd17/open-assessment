package org.ringcentral.library.entity.order;

import lombok.Getter;

@Getter
public enum OrderStatus {
  IN_PROGRESS,
  PAYMENT_INIT,
  PAYMENT_SUCESS,
  PAYMENT_FAILED,
  FULLFILMENT_INTIT,
  FULLFILMENT_SUCCESS,
  FULLFILMENT_FAILED,
  SUCCESS,
  FAILED
}
