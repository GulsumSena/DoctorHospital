package com.DoctorHospital.DoctorHospital.service.score;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.DoctorHospital.DoctorHospital.dto.AlvaradoDto;
import com.DoctorHospital.DoctorHospital.dto.GraceDto;
import com.DoctorHospital.DoctorHospital.dto.HeartDto;
import com.DoctorHospital.DoctorHospital.dto.MasccDto;
import com.DoctorHospital.DoctorHospital.dto.MehranDto;
import com.DoctorHospital.DoctorHospital.dto.TimiDto;
import com.DoctorHospital.DoctorHospital.model.Doctor;
import com.DoctorHospital.DoctorHospital.model.Patient;
import com.DoctorHospital.DoctorHospital.model.score.Alvarado;
import com.DoctorHospital.DoctorHospital.model.score.Grace;
import com.DoctorHospital.DoctorHospital.model.score.Heart;
import com.DoctorHospital.DoctorHospital.model.score.Mascc;
import com.DoctorHospital.DoctorHospital.model.score.Mehran;
import com.DoctorHospital.DoctorHospital.model.score.Timi;
import com.DoctorHospital.DoctorHospital.repository.DoctorRepository;
import com.DoctorHospital.DoctorHospital.repository.PatientRepository;
import com.DoctorHospital.DoctorHospital.repository.ScoreRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ScoreService {
	private final ScoreRepository repository;
	private final PatientRepository patientRep;
	private final DoctorRepository doctorRep;
	private final ModelMapper mapper;
	
	public void calcMascc(Long patientID, Long drID, MasccDto dto) {
		Mascc m=mapper.map(dto, Mascc.class);
		Doctor dr=doctorRep.findById(drID).orElse(null);
		Patient p=patientRep.findById(patientID).orElse(null);
		
		m.setDoctor(dr);
		m.setPatient(p);
		m.setNameScore("MASCC");
		m.setTotalOfMascc(dto.calculate());
		
		repository.save(m);
	}
	
	public void calcHeart(Long patientID, Long drID, HeartDto dto) {
		Heart h=mapper.map(dto, Heart.class);
		Doctor dr=doctorRep.findById(drID).orElse(null);
		Patient p=patientRep.findById(patientID).orElse(null);
		
		h.setDoctor(dr);
		h.setPatient(p);
		h.setNameScore("HEART");
		h.setTotalOfHeart(dto.calculate());
		
		repository.save(h);
	}
	
	public void calcGrace(Long patientID, Long drID, GraceDto dto) {
		Grace g=mapper.map(dto, Grace.class);
		Doctor dr=doctorRep.findById(drID).orElse(null);
		Patient p=patientRep.findById(patientID).orElse(null);
		
		g.setDoctor(dr);
		g.setPatient(p);
		g.setNameScore("GRACE");
		g.setTotalOfGrace(dto.calculate());
		
		repository.save(g);
	}
	
	public void calcTimi(Long patientID, Long drID, TimiDto dto) {
		Timi t=mapper.map(dto, Timi.class);
		Doctor dr=doctorRep.findById(drID).orElse(null);
		Patient p=patientRep.findById(patientID).orElse(null);
		
		t.setDoctor(dr);
		t.setPatient(p);
		t.setNameScore("TIMI");
		t.setTotalOfTimi(dto.calculate());
		repository.save(t);
	}
	
	public void calcMehran(Long patientID, Long drID, MehranDto dto) {
		Mehran m=mapper.map(dto, Mehran.class);
		Doctor dr=doctorRep.findById(drID).orElse(null);
		Patient p=patientRep.findById(patientID).orElse(null);
		
		m.setDoctor(dr);
		m.setPatient(p);
		m.setNameScore("MEHRAN");
		m.setTotalOfMehran(dto.calculate());
		
		repository.save(m);
	}
	
	public void calcAlvarado(Long patientID, Long drID, AlvaradoDto dto) {
		Alvarado a=mapper.map(dto, Alvarado.class);
		Doctor dr=doctorRep.findById(drID).orElse(null);
		Patient p=patientRep.findById(patientID).orElse(null);
		
		a.setDoctor(dr);
		a.setPatient(p);
		a.setNameScore("ALVARADO");
		a.setTotalOfAlvarado(dto.calculate());
		
		repository.save(a);
	}
}
