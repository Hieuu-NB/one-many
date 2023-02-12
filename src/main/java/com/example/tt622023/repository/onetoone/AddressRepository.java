package com.example.tt622023.repository.onetoone;

import com.example.tt622023.entity.onetoone.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

}
