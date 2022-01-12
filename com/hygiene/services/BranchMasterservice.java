package com.hygiene.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hygiene.entity.BranchMaster;
import com.hygiene.entity.ParameterThreshold;
@Service
public interface BranchMasterservice {
	public List<BranchMaster> getBranchMaster();
	public BranchMaster addBranch(BranchMaster branchMaster);
	public BranchMaster updateBranch(BranchMaster branchMaster);
	public BranchMaster deleteBranch(Long id);
}
