package com.flightapp.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.admin.entity.AirlineInventory;

@Repository
public interface AirlineInventoryRepository extends JpaRepository<AirlineInventory, Integer>{

}
