package com.hygiene.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hygiene.entity.BranchMaster;

@Repository 
public interface BranchRepository extends JpaRepository<BranchMaster,Long> {

}
