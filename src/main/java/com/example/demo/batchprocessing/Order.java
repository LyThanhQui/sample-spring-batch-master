package com.example.demo.batchprocessing;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class stores the user's purchase information
 */
@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer customerId;

    private Integer itemId;

    private String itemName;

    private Integer itemPrice;

    private String purchaseDate;

   


}

