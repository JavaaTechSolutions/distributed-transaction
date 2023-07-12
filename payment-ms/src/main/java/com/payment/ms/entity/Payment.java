package com.payment.ms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String mode;

	@Column
	private Long orderId;

	@Column
	private double amount;

	@Column
	private String status;

}
