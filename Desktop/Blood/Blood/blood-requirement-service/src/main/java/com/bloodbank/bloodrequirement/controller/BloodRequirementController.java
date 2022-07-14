package com.bloodbank.bloodrequirement.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.bloodrequirement.model.BloodRequirement;
import com.bloodbank.bloodrequirement.service.BloodRequirementService;
/*
 * The BloodRequirementController class for request controller
 *
 */
@RestController
public class BloodRequirementController {
	@Autowired
	private BloodRequirementService bloodRequirementService;
	
	public BloodRequirementController()
	{}

	/*
	 * Read Request to get the blood requirement details
	 */
	@GetMapping("/bloodrequirement")
	public ResponseEntity<Set<BloodRequirement>> getAllBloodRequirement(){
		return new ResponseEntity<Set<BloodRequirement>>(bloodRequirementService.getAllBloodRequirement(),HttpStatus.OK);
	}
	/*
	 * Adding details about the blood required and the user info
	 */
	@PostMapping("/bloodrequirement/add")
	public ResponseEntity<BloodRequirement> saveLocation(@RequestBody BloodRequirement newbloodrequirement)
	{
		return ResponseEntity.status(HttpStatus.OK).body(bloodRequirementService.saveBloodRequirement(newbloodrequirement));
	}
	
}
