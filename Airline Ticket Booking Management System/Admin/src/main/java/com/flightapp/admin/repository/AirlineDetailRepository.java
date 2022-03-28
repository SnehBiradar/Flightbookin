package com.flightapp.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.admin.entity.AirlineDetails;

@Repository
public interface AirlineDetailRepository extends JpaRepository<AirlineDetails, Integer> {

}
