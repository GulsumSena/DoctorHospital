package com.DoctorHospital.DoctorHospital.service.queryService;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.DoctorHospital.DoctorHospital.dto.response.PatientListQueryDto;
import com.DoctorHospital.DoctorHospital.dto.response.PatientListScoreQueryDto;
import com.DoctorHospital.DoctorHospital.query.PatientQuery;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientQueryService {
	private final JdbcTemplate template;
	private final PatientQuery queries;
	
	public List<PatientListQueryDto> listAccordingToGender(Integer gender){
		String sql=queries.listAccordingToGender(gender);
		return templateText(sql);
	}
	
	public List<PatientListQueryDto> listAccordingToAge(Integer minAge, Integer maxAge){
		String sql=queries.listAccordingToAge(minAge, maxAge);
		return templateText(sql);
	}
	
	public List<PatientListQueryDto> listAccordingToStatus(Integer status){
		String sql=queries.listAccordingToStatus(status);
		return templateText(sql);
	}
	
	public List<PatientListQueryDto> listAccordingToDoctor(Long drID){
		String sql=queries.listAccordingToDoctor(drID);
		return templateText(sql);
	}
	
	public List<PatientListQueryDto> templateText(String sql){
		return template.query(sql, 
				(rs, rowNum)->new PatientListQueryDto(
						rs.getLong("patient_id"),
						rs.getLong("doctor_id"),
						rs.getString("nameDoctor"),
						rs.getString("namePatient"),
						rs.getString("gender"),
						rs.getInt("agePatient"),
						rs.getInt("status")));
	}
	
	public List<PatientListScoreQueryDto> listPatientScore(Long id){
		String sql=queries.patientScores(id);
		return template.query(sql,
				(rs, rowNum)->new PatientListScoreQueryDto(
						rs.getString("namePatient"),
						rs.getInt("agePatient"),
						rs.getString("gender"),
						rs.getLong("patientID"),
						rs.getString("nameScore"),
						rs.getString("nameDoctor"),
						rs.getLong("doctorID")));
	}
}
