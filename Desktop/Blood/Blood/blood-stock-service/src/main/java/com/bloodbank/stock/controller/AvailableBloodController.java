package com.bloodbank.stock.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.stock.model.AvailableBlood;
import com.bloodbank.stock.service.AvailableBloodService;
import com.bloodbank.stock.service.impl.AvailableBloodServiceImpl;
/*
 * The AvailableBloodController class for request controller
 *
 */
@RestController
public class AvailableBloodController {
	
	@Autowired
	private AvailableBloodServiceImpl availableBloodService;

	public AvailableBloodController() {
	}
	//For admin to update the stocks and the user to check the availability of the blood
	@GetMapping("/availableblood")
	public ResponseEntity<List<AvailableBlood>> getAllAvailableBlood(){
		return ResponseEntity.status(HttpStatus.OK).body(availableBloodService.getAvailableBlood());
	}
	@PostMapping("/availableblood/add")
	public ResponseEntity<AvailableBlood> saveLocation(@RequestBody AvailableBlood newAvailableBlood)
	{

		return ResponseEntity.status(HttpStatus.OK).body(availableBloodService.saveAvailableBlood(newAvailableBlood));
	}

}