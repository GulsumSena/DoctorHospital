package com.DoctorHospital.DoctorHospital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DoctorHospital.DoctorHospital.dto.DeathNoteDto;
import com.DoctorHospital.DoctorHospital.dto.request.DeathNoteAddRequestDto;
import com.DoctorHospital.DoctorHospital.service.DeathNoteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/deathnote")
public class DeathNoteController {
	private final DeathNoteService service;
	
	@PostMapping("/add/{patientID}/{drID}")
	public String addNote(@PathVariable Long patientID, @PathVariable Long drID, @RequestBody DeathNoteAddRequestDto dto) {
		return service.addDeathNote(patientID, drID, dto);
	}
	
	@GetMapping("/")
	public List<DeathNoteDto> listAll(){
		return service.listAll();
	}
}
