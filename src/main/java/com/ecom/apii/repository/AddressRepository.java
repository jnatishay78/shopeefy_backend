package com.ecom.apii.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.apii.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
