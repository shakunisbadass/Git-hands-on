package com.bloodbank.stock.service;

import com.bloodbank.stock.repository.AvailableBloodRepository;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bloodbank.stock.model.AvailableBlood;

public interface AvailableBloodService {
	
	
	public List<AvailableBlood> getAvailableBlood();

	public AvailableBlood saveAvailableBlood(AvailableBlood newAvailableBlood);
	


		
	
	
}

