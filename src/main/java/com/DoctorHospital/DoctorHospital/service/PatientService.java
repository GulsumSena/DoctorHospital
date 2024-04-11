package com.DoctorHospital.DoctorHospital.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.DoctorHospital.DoctorHospital.dto.request.PatientAddRequestDto;
import com.DoctorHospital.DoctorHospital.dto.request.PatientListRequestDto;
import com.DoctorHospital.DoctorHospital.model.Doctor;
import com.DoctorHospital.DoctorHospital.model.Patient;
import com.DoctorHospital.DoctorHospital.repository.DoctorRepository;
import com.DoctorHospital.DoctorHospital.repository.PatientRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientService {
	private final PatientRepository repository;
	private final DoctorRepository drRep;
	private final ModelMapper mapper;
	
	public List<PatientListRequestDto> listAll(){
		List<Patient> patients=repository.findAll();
		return patients.stream()
				.map(patient->mapper.map(patient, PatientListRequestDto.class))
				.collect(Collectors.toList());
	}
	
	public void addPatient(PatientAddRequestDto dto, Long drID) {
		Patient p=mapper.map(dto, Patient.class);
		Doctor dr=drRep.findById(drID).orElse(null);
		p.setDoctor(dr);
		p.setStatus(1);
		repository.save(p);
	}
	
	public String dischargePatient(Long id) {
		if(repository.existsById(id)) {
			Patient p=repository.findById(id).orElse(null);
				if(p.getStatus()!=1) {
					return "Hasta taburcu edilemiyor. Ölmüş ya da daha önceden taburcu edilmiş olabilir";
				}else {
					p.setStatus(0);
					repository.save(p);
					return p.getNamePatient()+" taburcu edildi";
				}
			}else {
				return "bulunamadı";
			}
			
	}
}
