package com.DoctorHospital.DoctorHospital.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.DoctorHospital.DoctorHospital.dto.DeathNoteDto;
import com.DoctorHospital.DoctorHospital.dto.request.DeathNoteAddRequestDto;
import com.DoctorHospital.DoctorHospital.model.DeathNote;
import com.DoctorHospital.DoctorHospital.model.Doctor;
import com.DoctorHospital.DoctorHospital.model.Patient;
import com.DoctorHospital.DoctorHospital.repository.DeathNoteRepository;
import com.DoctorHospital.DoctorHospital.repository.DoctorRepository;
import com.DoctorHospital.DoctorHospital.repository.PatientRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeathNoteService {
	private final DeathNoteRepository repository;
	private final DoctorRepository doctorRep;
	private final PatientRepository patientRep;
	private final ModelMapper mapper;
	
	public String addDeathNote(Long patientID, Long drID, DeathNoteAddRequestDto dto) {
		Patient p=patientRep.findById(patientID).orElse(null);
		if(p.getStatus()==(1)) {
			Doctor dr=doctorRep.findById(drID).orElse(null);
			DeathNote dn=mapper.map(dto, DeathNote.class);
			LocalDateTime ldt=LocalDateTime.now();
			p.setStatus((-1));
			dn.setTime(ldt);
			dn.setDoctor(dr);
			dn.setPatient(p);
			repository.save(dn);
			return p.getNamePatient()+" ölüm bildirimi yapıldı.";
		}else if (p.getStatus()==0 || p.getStatus()==(-1)){
			return "hasta için ölüm bildirimi yapılamaz";
		}else {
			return null;
		}
		
		
		
	}
	
	public List<DeathNoteDto> listAll(){
		List<DeathNote> notes=repository.findAll();
		return notes.stream()
				.map(not->mapper.map(not, DeathNoteDto.class))
				.collect(Collectors.toList());
	}
}
