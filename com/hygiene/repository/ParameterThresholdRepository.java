package com.hygiene.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hygiene.entity.ParameterThreshold;
@Repository
public interface ParameterThresholdRepository extends JpaRepository<ParameterThreshold,Long> {

}
