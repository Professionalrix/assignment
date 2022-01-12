package com.hygiene.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hygiene.entity.AQIDate;
import com.hygiene.entity.BranchMaster;
import com.hygiene.repository.BranchRepository;

@Service
public class BranchMasterServiceImpl implements BranchMasterservice {
	
	@Autowired
	BranchRepository repo;
	@Override
	public List<BranchMaster> getBranchMaster() {
		return repo.findAll();
	}

	@Override
	public BranchMaster addBranch(BranchMaster branchMaster) {
		// TODO Auto-generated method stub
		return repo.save(branchMaster);
	}

	@Override
	public BranchMaster updateBranch(BranchMaster branchMaster) {
		// TODO Auto-generated method stub
		return repo.save(branchMaster);
	}

	@Override
	public BranchMaster deleteBranch(Long id) {
		Optional<BranchMaster> object=repo.findById(id);
		
		if(object==null)
		{
			throw new RuntimeException("data not found");
		}
		else {
			repo.delete(object.get());
			return object.get();
		}
	}

}
