package com.murali.natwest.eobao.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customeraccounttypes")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAccountType {

    @Id
    private String id;
    private CustomerType customerType;

    private AccountType accountType;


}
