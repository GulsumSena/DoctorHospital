package com.DoctorHospital.DoctorHospital.service;

import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.DoctorHospital.DoctorHospital.dto.request.ClinicInfoAddRequestDto;
import com.DoctorHospital.DoctorHospital.model.ClinicInfo;
import com.DoctorHospital.DoctorHospital.model.Doctor;
import com.DoctorHospital.DoctorHospital.model.Patient;
import com.DoctorHospital.DoctorHospital.repository.ClinicInfoRepository;
import com.DoctorHospital.DoctorHospital.repository.DoctorRepository;
import com.DoctorHospital.DoctorHospital.repository.PatientRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClinicInfoService {
	private final ClinicInfoRepository repository;
	private final DoctorRepository drRep;
	private final PatientRepository patRep;
	private final ModelMapper mapper;
	
	public void addInfo(ClinicInfoAddRequestDto dto, Long drID, Long patientID) {
		ClinicInfo info=mapper.map(dto, ClinicInfo.class);
		Patient patient=patRep.findById(patientID).orElse(null);
		Doctor dr=drRep.findById(drID).orElse(null);
		LocalDateTime ldt=LocalDateTime.now();
		info.setTime(ldt);
		info.setDoctor(dr);
		info.setPatient(patient);
		repository.save(info);
	}
}
