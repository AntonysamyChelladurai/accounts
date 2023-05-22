package com.jbeans.accounts.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Customer {
    @Column(name="customer_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int customerId;
    @Column(name="name")
    private String customerName;
    @Column(name="email")
    private String customerEmail;
    @Column(name="mobile")
    private String customerNumber;
    @Column(name="create_dt")
    private String customerDt;


}
