package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Lead;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	
	@RequestMapping("/view")
	public String viewCreateLaedPage() {
		
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
}
