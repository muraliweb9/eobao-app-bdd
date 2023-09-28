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
public class GetStartedInfo {
    @Id
    private String arn;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    private String mobileNumber;

    private String countryOfBirth;

    private String nationality;

    private String address;




}
