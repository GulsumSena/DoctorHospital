package com.DoctorHospital.DoctorHospital.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DoctorHospital.DoctorHospital.dto.request.DrListRequestDto;
import com.DoctorHospital.DoctorHospital.dto.request.DrPasswordRequestDto;
import com.DoctorHospital.DoctorHospital.dto.request.DrSignUpRequestDto;
import com.DoctorHospital.DoctorHospital.dto.request.DrUsernameRequestDto;
import com.DoctorHospital.DoctorHospital.model.Branch;
import com.DoctorHospital.DoctorHospital.model.Doctor;
import com.DoctorHospital.DoctorHospital.repository.BranchRepository;
import com.DoctorHospital.DoctorHospital.repository.DoctorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@RequestMapping("/doctor")
public class DoctorService {
	private final DoctorRepository repository;
	private final BranchRepository branchRep;
	private final ModelMapper mapper;
	
	public void signUpDr(DrSignUpRequestDto dto, Long branchID) {
		Doctor dr=mapper.map(dto, Doctor.class);
		Branch b=branchRep.findById(branchID).orElse(null);
		dr.setBranch(b);
		repository.save(dr);
	}
	
	public List<DrListRequestDto> listAll(){
		List<Doctor> doctors=repository.findAll();
		return doctors.stream()
				.map(dr -> mapper.map(dr, DrListRequestDto.class))
				.collect(Collectors.toList());
	}
	
	public void updatePassword(DrPasswordRequestDto dto, Long id) {
		if(repository.existsById(id)) {
			Doctor dr=repository.findById(id).orElse(null);
			dr.setPassword(dto.getPassword());
			repository.save(dr);
		}
	}
	
	public void updateUsername(DrUsernameRequestDto dto, Long id) {
		if(repository.existsById(id)) {
			Doctor dr=repository.findById(id).orElse(null);
			dr.setPassword(dto.getUsername());
			repository.save(dr);
		}
	}
	
}