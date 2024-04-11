package com.DoctorHospital.DoctorHospital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DoctorHospital.DoctorHospital.dto.AlvaradoDto;
import com.DoctorHospital.DoctorHospital.dto.GraceDto;
import com.DoctorHospital.DoctorHospital.dto.HeartDto;
import com.DoctorHospital.DoctorHospital.dto.MasccDto;
import com.DoctorHospital.DoctorHospital.dto.MehranDto;
import com.DoctorHospital.DoctorHospital.dto.TimiDto;
import com.DoctorHospital.DoctorHospital.dto.response.ScoreQueryDto;
import com.DoctorHospital.DoctorHospital.service.queryService.ScoreQueryService;
import com.DoctorHospital.DoctorHospital.service.score.ScoreService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/score")
public class ScoreController {
	private final ScoreService service;
	private final ScoreQueryService queryService;
	
	@PostMapping("/mascc/{patientID}/{drID}")
	public void calcMascc(@PathVariable Long patientID, @PathVariable Long drID, @RequestBody MasccDto dto) {
		service.calcMascc(patientID, drID, dto);
	}
	
	@PostMapping("/heart/{patientID}/{drID}")
	public void calcHeart(@PathVariable Long patientID, @PathVariable Long drID, @RequestBody HeartDto dto) {
		service.calcHeart(patientID, drID, dto);
	}
	
	@PostMapping("/grace/{patientID}/{drID}")
	public void calcGrace(@PathVariable Long patientID, @PathVariable Long drID, @RequestBody GraceDto dto) {
		service.calcGrace(patientID, drID, dto);
	}
	
	@PostMapping("/timi/{patientID}/{drID}")
	public void calcTimi(@PathVariable Long patientID, @PathVariable Long drID, @RequestBody TimiDto dto) {
		service.calcTimi(patientID, drID, dto);
	}
	
	@PostMapping("/mehran/{patientID}/{drID}")
	public void calcMehran(@PathVariable Long patientID, @PathVariable Long drID, @RequestBody MehranDto dto) {
		service.calcMehran(patientID, drID, dto);
	}
	
	@PostMapping("/alvarado/{patientID}/{drID}")
	public void calcAlvarado(@PathVariable Long patientID, @PathVariable Long drID, @RequestBody AlvaradoDto dto) {
		service.calcAlvarado(patientID, drID, dto);
	}
	
	@GetMapping("/mascc")
	public List<ScoreQueryDto> listMascc(){
		return queryService.listMascc();
	}
	@GetMapping("/heart")
	public List<ScoreQueryDto> listHeart(){
		return queryService.listHeart();
	}
	@GetMapping("/grace")
	public List<ScoreQueryDto> listGrace(){
		return queryService.listGrace();
	}
	@GetMapping("/timi")
	public List<ScoreQueryDto> listTimi(){
		return queryService.listTimi();
	}
	@GetMapping("/alvarado")
	public List<ScoreQueryDto> listAlvarado(){
		return queryService.listAlvarado();
	}
	@GetMapping("/mehran")
	public List<ScoreQueryDto> listMehran(){
		return queryService.listMehran();
	}
	
}
