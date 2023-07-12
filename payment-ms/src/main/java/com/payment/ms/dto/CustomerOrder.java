package com.payment.ms.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerOrder {

	private String item;

	private int quantity;

	private double amount;

	private String paymentMode;

	private Long orderId;

	private String address;

}
