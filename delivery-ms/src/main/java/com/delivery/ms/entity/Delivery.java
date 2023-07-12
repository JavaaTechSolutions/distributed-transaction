package com.delivery.ms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Delivery {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String address;

	@Column
	private String status;

	@Column
	private long orderId;

}
