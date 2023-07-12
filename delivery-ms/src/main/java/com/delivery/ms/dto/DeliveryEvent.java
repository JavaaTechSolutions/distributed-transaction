package com.delivery.ms.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeliveryEvent {

	private String type;

	private CustomerOrder order;

}
