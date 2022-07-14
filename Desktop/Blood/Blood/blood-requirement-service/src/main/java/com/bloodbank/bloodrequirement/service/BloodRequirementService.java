package com.bloodbank.bloodrequirement.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.bloodrequirement.model.BloodRequirement;
import com.bloodbank.bloodrequirement.repository.BloodRequirementRepository;

@Service
public class BloodRequirementService {
	@Autowired
	private BloodRequirementRepository bloodRequirementRepository;

	public BloodRequirementService(BloodRequirementRepository bloodRequirementRepository) {
		super();
		this.bloodRequirementRepository = bloodRequirementRepository;
	}
	
	public Set<BloodRequirement> getAllBloodRequirement(){
		return bloodRequirementRepository.getAllBloodRequirement();
	}

	public BloodRequirement saveBloodRequirement(BloodRequirement newbloodrequirement) {
		// TODO Auto-generated method stub
		return bloodRequirementRepository.save(newbloodrequirement);
	}
}

