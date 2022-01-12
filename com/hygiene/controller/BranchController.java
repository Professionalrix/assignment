package com.hygiene.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hygiene.entity.BranchMaster;
import com.hygiene.services.BranchMasterservice;

@RestController
public class BranchController {
			@Autowired
		BranchMasterservice service;
	
		@GetMapping("/branch")
	public List<BranchMaster> getDate() {
		return service.getBranchMaster();
	}
		@PostMapping("/branch")
	public BranchMaster addBranch(@RequestBody BranchMaster branchMaster) {
		// TODO Auto-generated method stub
		return service.addBranch(branchMaster);
	}
		
		@PutMapping("/branch")
	public BranchMaster updateBranch(@RequestBody BranchMaster branchMaster) {
		// TODO Auto-generated method stub
		return service.updateBranch(branchMaster);
	}
		@DeleteMapping("/branch/{id}")
	public BranchMaster deleteBranch(@PathVariable Long id) {
		return service.deleteBranch(id);
	}

	
}
