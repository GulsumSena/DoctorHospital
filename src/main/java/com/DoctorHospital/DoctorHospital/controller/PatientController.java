package com.DoctorHospital.DoctorHospital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DoctorHospital.DoctorHospital.dto.request.PatientAddRequestDto;
import com.DoctorHospital.DoctorHospital.dto.request.PatientListRequestDto;
import com.DoctorHospital.DoctorHospital.dto.response.PatientListQueryDto;
import com.DoctorHospital.DoctorHospital.dto.response.PatientListScoreQueryDto;
import com.DoctorHospital.DoctorHospital.service.PatientService;
import com.DoctorHospital.DoctorHospital.service.queryService.PatientQueryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patient")
public class PatientController {
	private final PatientService service;
	private final PatientQueryService queryService;
	
	@GetMapping("/")
	public List<PatientListRequestDto> listAll(){
		return service.listAll();
	}
	
	@PostMapping("/add/{drID}")
	public void addPatient(@RequestBody PatientAddRequestDto dto, @PathVariable Long drID) {
		service.addPatient(dto, drID);
	}
	
	@PutMapping("/discharge/{id}")
	public String dischargePatient(@PathVariable Long id) {
		return service.dischargePatient(id);
	}
	
	@GetMapping("/listAccordingToAge/{minAge}/{maxAge}")
	public List<PatientListQueryDto> listAccordingToAge(@PathVariable Integer minAge, @PathVariable Integer maxAge){
		return queryService.listAccordingToAge(minAge, maxAge);
	}
	
	@GetMapping("/listAccordingToGender/{gender}")
	public List<PatientListQueryDto> listAccordingToGender(@PathVariable Integer gender){
		return queryService.listAccordingToGender(gender);
	}
	
	@GetMapping("/listAccordingToStatus/{status}")
	public List<PatientListQueryDto> listAccordingToStatus (@PathVariable Integer status){
		return queryService.listAccordingToStatus(status);
	}
	
	@GetMapping("/listAccordingToDoctor/{drID}")
	public List<PatientListQueryDto> listAccordingToDoctor(@PathVariable Long drID){
		return queryService.listAccordingToDoctor(drID);
	}
	
	@GetMapping("/patientScore/{id}")
	public List<PatientListScoreQueryDto> patientScore(@PathVariable Long id){
		return queryService.listPatientScore(id);
	}
	
}
