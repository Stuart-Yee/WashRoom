package com.washroom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.washroom.models.Dryer;
import com.washroom.models.Washer;
import com.washroom.services.MainService;

@Controller
public class mainController {
	
	@Autowired
	MainService mServ;
	
	@GetMapping("/")
	public String showRoom(Model viewModel) {
		viewModel.addAttribute("dryers", mServ.getAllDryers());
		viewModel.addAttribute("washers", mServ.getAllWashers());
		
		return "laundry.jsp";
	}
	
	//Load and empty dryer methods
	@PostMapping("/dryer/use/{dryer_id}")
	public String startDryer(@PathVariable("dryer_id")Long dryerId, 
			@RequestParam("start") String start, 
			@RequestParam("finish") String finish) {
		
		Dryer thisDryer = mServ.findDryerById(dryerId);
		thisDryer.setStartTime(start);
		thisDryer.setFinishTime(finish);
		thisDryer.setInUse(true);
		mServ.saveDryer(thisDryer);
		
		return "redirect:/";
	}
	
	@PostMapping("/dryer/empty/{dryer_id}")
	public String emptyDryer(@PathVariable("dryer_id")Long dryerId) {
		
		Dryer thisDryer = mServ.findDryerById(dryerId);
		thisDryer.setStartTime(null);
		thisDryer.setFinishTime(null);
		thisDryer.setInUse(false);
		mServ.saveDryer(thisDryer);
		
		return "redirect:/";
	}
	
	//Load and empty washer methods
	@PostMapping("/washer/use/{washer_id}")
	public String startWasher(@PathVariable("washer_id")Long dryerId, 
			@RequestParam("start") String start, 
			@RequestParam("finish") String finish) {
		
		Washer thisWasher = mServ.findWasherById(dryerId);
		thisWasher.setStartTime(start);
		thisWasher.setFinishTime(finish);
		thisWasher.setInUse(true);
		mServ.saveWasher(thisWasher);
		
		return "redirect:/";
	}
	
	@PostMapping("/washer/empty/{washer_id}")
	public String emptyWasher(@PathVariable("washer_id")Long dryerId) {
		
		Washer thisWasher = mServ.findWasherById(dryerId);
		thisWasher.setStartTime(null);
		thisWasher.setFinishTime(null);
		thisWasher.setInUse(false);
		mServ.saveWasher(thisWasher);
		
		return "redirect:/";
	}

}
