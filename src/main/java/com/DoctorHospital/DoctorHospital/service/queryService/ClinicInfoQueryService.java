package com.DoctorHospital.DoctorHospital.service.queryService;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.DoctorHospital.DoctorHospital.dto.response.ClinicInfoQueryDto;
import com.DoctorHospital.DoctorHospital.query.ClinicInfoQuery;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClinicInfoQueryService {
	private final JdbcTemplate template;
	private final ClinicInfoQuery queries;
	
	public List<ClinicInfoQueryDto> listAccordingToPatient(Long id){
		String sql=queries.listAccordingToPatient(id);
		return templateText(sql);
	}
	
	public List<ClinicInfoQueryDto> listAccordingToDoctor(Long id){
		String sql=queries.listAccordingToDoctor(id);
		return templateText(sql);
	}
	
	public List<ClinicInfoQueryDto> showDeathNote(Long id){
		String sql=queries.showDeathNote(id);
		return templateText(sql);
	}
	
	public List<ClinicInfoQueryDto> templateText(String sql){
		return template.query(sql,
				(rs, rowNum) -> new ClinicInfoQueryDto(
						rs.getLong("patient_id"),
						rs.getLong("doctor_id"),
						rs.getString("body"),
						rs.getString("time"),
						rs.getString("nameDoctor"),
						rs.getString("namePatient")
						));
	}
}
