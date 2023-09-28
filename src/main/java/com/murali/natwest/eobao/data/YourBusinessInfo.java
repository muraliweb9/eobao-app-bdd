package com.murali.natwest.eobao.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class YourBusinessInfo {
    @Id
    private String arn;

    private String businessName;

    private String website;

    private String startedTradingSince;


}
