package com.washroom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.washroom.models.Dryer;
import com.washroom.models.Washer;
import com.washroom.services.MainService;

@Controller
public class GenesisController {
	
	@Autowired
	MainService mServ;
	
	@GetMapping("/genesis")
	public String showGenesis() {
		return "genesis.jsp";
	}
	
	@PostMapping("/genesis")
	public String genesis(
			@RequestParam("machine") String machine, 
			@RequestParam("row") String row, 
			@RequestParam("number") String number) {
		
		int intNum = Integer.valueOf(number);
		
		for (int i = 1; i <= intNum; i++ ) {
			if(machine.equals("dryer")) {
				Dryer thisDryer = new Dryer ();
				thisDryer.setMachineNumber(i);
				thisDryer.setMachineRow(row);
				mServ.saveDryer(thisDryer);
			} else if (machine.equals("washer")) {
				Washer thisWasher = new Washer();
				thisWasher.setMachineNumber(i);
				thisWasher.setMachineRow(row);
				mServ.saveWasher(thisWasher);
			}
		}
		
		return "redirect:/genesis";
	}
}
