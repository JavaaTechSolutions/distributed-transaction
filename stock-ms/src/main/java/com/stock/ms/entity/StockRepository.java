package com.stock.ms.entity;

import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<WareHouse, Long> {

	Iterable<WareHouse> findByItem(String item);
}
