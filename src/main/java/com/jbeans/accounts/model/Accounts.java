package com.jbeans.accounts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Getter @Setter @ToString
public class Accounts {
    @Column(name="customer_id")
    private int customerId;
    @Column(name="account_number")
    @Id
    private  long accNum;
    @Column(name="account_type")
    private String accType;
    @Column(name="branch_address")
    private String branchAdd;
    @Column(name="create_dt")
    private LocalDate createDt;
}
