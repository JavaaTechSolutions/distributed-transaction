package com.payment.ms.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderEvent {

	private String type;

	private CustomerOrder order;

}
