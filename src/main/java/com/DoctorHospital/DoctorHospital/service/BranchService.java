package com.DoctorHospital.DoctorHospital.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.DoctorHospital.DoctorHospital.dto.BranchDto;
import com.DoctorHospital.DoctorHospital.dto.response.BranchWDrDto;
import com.DoctorHospital.DoctorHospital.model.Branch;
import com.DoctorHospital.DoctorHospital.repository.BranchRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BranchService {
	private final BranchRepository repository;
	private final ModelMapper mapper;
	
	public List<BranchDto> listAll(){
		List<Branch> branchs=repository.findAll();
		return branchs.stream()
				.map(br->mapper.map(br, BranchDto.class))
				.collect(Collectors.toList());
	}
	
	public List<BranchWDrDto> listBranchDr(){
		List<Branch> br=repository.findAll();
		return br.stream()
				.map(branchDr->mapper.map(branchDr, BranchWDrDto.class))
				.collect(Collectors.toList());
	}
}
