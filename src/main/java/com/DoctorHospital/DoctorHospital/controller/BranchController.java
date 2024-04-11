package com.DoctorHospital.DoctorHospital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DoctorHospital.DoctorHospital.dto.BranchDto;
import com.DoctorHospital.DoctorHospital.dto.response.BranchWDrDto;
import com.DoctorHospital.DoctorHospital.service.BranchService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/branch")
public class BranchController {
	private final BranchService service;
	
	@GetMapping("/")
	public List<BranchDto> listAll(){
		return service.listAll();
	}
	
	@GetMapping("/branchDr")
	public List<BranchWDrDto> listBranchDr(){
		return service.listBranchDr();
	}
}
