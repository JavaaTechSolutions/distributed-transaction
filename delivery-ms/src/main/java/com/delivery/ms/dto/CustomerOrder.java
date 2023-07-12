package com.delivery.ms.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerOrder {

	private String item;

	private int quantity;

	private double amount;

	private String paymentMode;

	private Long orderId;

	private String address;

}
