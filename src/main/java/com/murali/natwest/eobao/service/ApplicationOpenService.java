package com.murali.natwest.eobao.service;

import com.murali.natwest.eobao.data.AccountType;
import com.murali.natwest.eobao.data.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("app-open")
@Slf4j
public class ApplicationOpenService {

    @GetMapping("/available")
    public List<AccountType> getCompany() {
        log.info("Getting the available type of accounts");

        return Arrays.asList(AccountType.values());

    }
}
