package com.washroom.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.washroom.models.Dryer;
import com.washroom.models.Washer;
import com.washroom.repositories.DryerRepository;
import com.washroom.repositories.WasherRepository;

@Service
public class MainService {
	
	DryerRepository dRepo;
	WasherRepository wRepo;
	
	public MainService(DryerRepository dRepo, WasherRepository wRepo) {
		this.dRepo = dRepo;
		this.wRepo = wRepo;
	}
	
	public void saveWasher(Washer washer) {
		wRepo.save(washer);
	}
	
	public void saveDryer(Dryer dryer) {
		dRepo.save(dryer);
	}
	
	public List<Dryer> getAllDryers(){
		return (List<Dryer>) dRepo.findAll();
	}
	
	public List<Washer> getAllWashers(){
		return (List<Washer>) wRepo.findAll();
	}
	
	public Dryer findDryerById(Long id) {
		return dRepo.findById(id).get();
	}
	
	public Washer findWasherById(Long id) {
		return wRepo.findById(id).get();
	}
	
	

}
