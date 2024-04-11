package com.DoctorHospital.DoctorHospital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DoctorHospital.DoctorHospital.dto.request.ClinicInfoAddRequestDto;
import com.DoctorHospital.DoctorHospital.dto.response.ClinicInfoQueryDto;
import com.DoctorHospital.DoctorHospital.service.ClinicInfoService;
import com.DoctorHospital.DoctorHospital.service.queryService.ClinicInfoQueryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/info")
public class ClinicInfoController {
	private final ClinicInfoService service;
	private final ClinicInfoQueryService queryService;
	
	@PostMapping("/add/{drID}/{patientID}")
	public void addInfo(@RequestBody ClinicInfoAddRequestDto dto, @PathVariable Long drID, @PathVariable Long patientID) {
		service.addInfo(dto, drID, patientID);
	}
	
	@GetMapping("/listAccordingToPatient/{id}")
	public List<ClinicInfoQueryDto> listAccordingToPatient(@PathVariable Long id){
		return queryService.listAccordingToPatient(id);
	}
	
	@GetMapping("/listAccordingToDoctor/{id}")
	public List<ClinicInfoQueryDto> listAccordingToDoctor(@PathVariable Long id){
		return queryService.listAccordingToDoctor(id);
	}
	
	@GetMapping("/showDeathNote/{id}")
	public List<ClinicInfoQueryDto> showDeathNote(@PathVariable Long id){
		return queryService.showDeathNote(id);
	}
}
