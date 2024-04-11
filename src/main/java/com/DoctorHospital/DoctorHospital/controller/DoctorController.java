package com.DoctorHospital.DoctorHospital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DoctorHospital.DoctorHospital.dto.request.DrListRequestDto;
import com.DoctorHospital.DoctorHospital.dto.request.DrPasswordRequestDto;
import com.DoctorHospital.DoctorHospital.dto.request.DrSignUpRequestDto;
import com.DoctorHospital.DoctorHospital.dto.request.DrUsernameRequestDto;
import com.DoctorHospital.DoctorHospital.dto.response.DoctorQueryDto;
import com.DoctorHospital.DoctorHospital.service.DoctorService;
import com.DoctorHospital.DoctorHospital.service.queryService.DoctorQueryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/doctor")
public class DoctorController {
	private final DoctorService service;
	private final DoctorQueryService queryService;
	
	@PostMapping("/add/{branchID}")
	public void signUpDr(@RequestBody DrSignUpRequestDto dto, @PathVariable Long branchID) {
		service.signUpDr(dto, branchID);
	}
	
	@GetMapping("/")
	public List<DrListRequestDto> listAll(){
		return service.listAll();
	}
	
	@PutMapping("/updatePassword/{id}")
	public void updatePassword(@RequestBody DrPasswordRequestDto dto, @PathVariable Long id) {
		service.updatePassword(dto, id);
	}
	
	@PutMapping("/updateUsername/{id}")
	public void updateUsername(@RequestBody DrUsernameRequestDto dto, @PathVariable Long id) {
		service.updateUsername(dto, id);
	}
	
	@GetMapping("/branchDoctor/{branchID}")
	public List<DoctorQueryDto> listBranchDoctor(@PathVariable Long branchID){
		return queryService.listBranchDoctor(branchID);
	}
}
