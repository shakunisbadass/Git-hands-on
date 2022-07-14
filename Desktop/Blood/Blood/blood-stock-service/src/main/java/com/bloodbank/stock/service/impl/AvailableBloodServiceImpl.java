package com.bloodbank.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.stock.model.AvailableBlood;
import com.bloodbank.stock.repository.AvailableBloodRepository;
import com.bloodbank.stock.service.AvailableBloodService;

@Service
public class AvailableBloodServiceImpl implements AvailableBloodService
{
	@Autowired
	private AvailableBloodRepository availableBloodRepository;
	@Override
	public List<AvailableBlood> getAvailableBlood(){
		return availableBloodRepository.findAll();
	}
	@Override
	public AvailableBlood saveAvailableBlood(AvailableBlood newAvailableBlood) {
		// TODO Auto-generated method stub
		return availableBloodRepository.save(newAvailableBlood);
	}
}
