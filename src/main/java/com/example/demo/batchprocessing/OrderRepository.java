package com.example.demo.batchprocessing;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * The OrderRepository
 */
@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
	
}
