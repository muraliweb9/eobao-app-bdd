package com.murali.natwest.eobao.repo;


import com.murali.natwest.eobao.data.CustomerAccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAccountTypeRepository extends JpaRepository<CustomerAccountType, String> {
}